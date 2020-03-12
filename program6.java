import java.util.*;

public class  program6
{ 
    
     static final int max = 32; 
      

    
     static int oneoccur(ArrayList<Integer> a, int n) 
    
     { 
        
        int element = 0; 
        
        int x, sum; 
         
        for(int i=0; i<max; i++) 
        
        { 
            
           
        sum = 0; 
            
        x = (1 << i); 
           
        for(int j=0; j<n; j++) 
            
        { 
                
             if((a.get(j) & x) == 0) 
                
             sum++; 
            
        } 
            
           
        if ((sum % 3) == 0) 
           
        element |= x; 
       
    } 
       
    return element; 
    
} 
      
  
  
public static void main(String args[]) 
    
{ 
         
    ArrayList<Integer> a = new ArrayList<Integer>(); 
        
    Scanner sc=new Scanner(System.in);
        
    int num;
        
    num=sc.nextInt();
  
    //scanning list of elements     
    for(int i=0;i<num;i++)
        
    {
            
    int x=sc.nextInt();
            
    a.add(x);
            
        
    }
        
    int n=a.size();
  
    //calling a function that gives the element that occu only once      
    System.out.println(oneoccur(a,n));
        
  
} 
      

} 


/*
4
2 3 2 2 
3


7
1 2 1 2 3 1 2
3

6
 1 2 1 2 2 1 
-1
*/



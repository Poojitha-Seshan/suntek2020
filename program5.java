import java.util.*;

public class program5
{
 
   static int noofsetbits(int n) // function to find no of ones
    
    {
         
       int c=0;
        
       while(n!=0)
        
       {
            
          n=(n&(n-1));
            
          c++;
        
       }
        
       return c;
    
    }
    
    
     public static void main(String args[])  
    
     {  
        
       int num;
        
       Scanner sc=new Scanner(System.in);
        
       num=sc.nextInt();  //scanning the number
  
       int[] a=new int[num+1];
       for(int i=0;i<=num;i++)

       {        
       a[i]=noofsetbits(i);   
       System.out.print(a[i]+" ");  
       }
       }
}



/*
2
0 1 1

7
0 1 1 2 1 2 2 3

0
0


54
0 1 1 2 1 2 2 3 1 2 2 3 2 3 3 4 1 2 2 3 2 3 3 4 2 3 3 4 3 4 4 5 1 2 2 3 2 3 3 4 2 3 3 4 3 4 4 5 2 3 3 4 3 4 4

*/
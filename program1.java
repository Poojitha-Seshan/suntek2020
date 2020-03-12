import java.util.*;

public class program1
{
    
	static int[] returnarray(int[] x,int[][] y,int z
)    
	{
        
        
		int[] a=new int[z];
        
		for(int i=0;i<z;i++)
        
       
		{
            
		int answer=0;
                       
		for(int j=y[i][0];j<=y[i][1];j++)
            
		{ 
		answer=answer^x[j];
         //xoring the elements   
		}
            
		a[i]=answer;
        
		}
        
		return a;
    //returning a array that contains result
	}	
	public static  void main(String[] args) 
	{  
	    
		int no_of_elements,no_of_queries;
	    
		Scanner sc=new Scanner(System.in);
		//taking no of elements
	    
		no_of_elements=sc.nextInt();
	     
		int[] arr=new int[no_of_elements];

		// scanning array elements//	    
		for(int i=0;i<no_of_elements;i++)
	    	        
		arr[i]=sc.nextInt();

		//taking no of queries	    
		no_of_queries=sc.nextInt();
	    	
		int[][] queries=new int[no_of_queries][2];

		//taking queries into 2d array	    
		for(int i=0;i<no_of_queries;i++)
	    
		for(int j=0;j<2;j++)
	    
		queries[i][j]=sc.nextInt();
	   
		//calliing a function that returns array of results//
		int[] result=returnarray(arr,queries,no_of_queries);
                //printing the result
		for(int i=0;i<result.length;i++)
	    
		System.out.print(result[i]+" ");
	
	}
	    
	    
		

}


/*
7(no of elements)
1 2 3 4 5 6 7(elements)
4(no of queries)
0 5 (queries)
1 3
2 6
0 3
7 5 3 4(result)
*/





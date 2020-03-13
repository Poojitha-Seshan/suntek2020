import java.lang.*;
import java.util.*;
public class program3  
{ 
  
    // Function to return the maximum xor
    static int maximumxor(int arr[], int n)  
    { 
        int maximum=0; 
  
        
        for (int i=0; i<n; i++) 
        { 
            for (int j=i+1; j<n; j++)  
            { 
                maximum = Math.max(maximum,arr[i] ^ arr[j]); 
	    }
                         
        } 
        return maximum; 
    } 
    public static void main(String[] args)  
    { 
	int no_of_elements;
	Scanner sc=new Scanner(System.in);
	no_of_elements=sc.nextInt();
        int[] array= new int[no_of_elements];  //array declaration
	for(int i=0;i<no_of_elements;i++)
	array[i]=sc.nextInt();                  //scanning elements of array
        int n = array.length; 
  	System.out.println(maximumxor(array, n)); 
    } 
}  
  

/*
6
2 3 5 8 10 25
28

5
25 36 12 3 78
106

10
10 9 8 7 6 1 2 3 4 5
15
*/
  
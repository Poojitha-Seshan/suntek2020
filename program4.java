import java.lang.*;
import java.util.*;
public class program4
{
	static int replacement(int n)
	{
		int x=0;    
		/* the logic is if it is even -->direct divide by 2
		   if odd then  a)if we do n=n+1 and divide n by 2 gives even then continue by taking n=n+1
				b)else do n=n-1
                   example:
		   9->10->5(odd)so do n=n-1 i.e 9->8 and recur for 8 again.this continues until 1.
		   11->12->6(even) so can continue with 11->12 and recur for 12 again until 1.*/
		
                if(n!=1)
		{
		if(n%2==0)
		{
		   n=n/2;
		   
		   x=1+replacement(n);
		}
		else 
		{
		  if(((n+1/2)%2)==1)
		   {
		      n=n-1;
		      x=1+replacement(n);
		   }
		   else
		    {
			n=n+1;
			x=1+replacement(n);
		    }
		}
		}
		return x;
	}		
	public static void main(String[] args)
	{
		int element;
		Scanner sc=new Scanner(System.in);
		element=sc.nextInt();		//scanning the element
		int result=replacement(element);
		System.out.println(result);
	}
		
}
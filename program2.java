import java.util.*;
public class program2
{
	static int minreplace(int a,int b,int c)
	{
		int result=0;
		for(int i=0;i<32;i++)
		{
		int x=(1<<i);
		int setbits=0;
		//checking for set bits at ith position in a
		if((x&a)!=0)
		setbits++;
		//checking for setbits at ith position in b
		if((x&b)!=0)
		setbits++;
		//checking for set bits in c
		if((x&c)!=0)
		{
		   //if there are no set bits in both a and b then atleast one bit must be set
		   if(setbits==0)
			result=result+1;
		}
		else
		{
		   //if not setbit of c then both bits of a and b must be zero
	           result=result+setbits;
		}
		}
		return result;
	}
	public static void main(String[] args)
	{
		int a,b,c,x;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		x=minreplace(a,b,c); //calling function to find minimumreplacements
		System.out.println(x);
	}
}


/*
2 5 7
0

46 75 65
6


23 12 87
2

*/



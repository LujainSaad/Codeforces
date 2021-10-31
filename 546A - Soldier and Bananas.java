import java.util.*;
import java.lang.Math;
public class Lujain 
{
	public static void main(String[] args) throws java.lang.Exception
	{	int k,n,w,c,j = 0;
		Scanner S = new Scanner(System.in);
		k=S.nextInt();//first banana cost
		n=S.nextInt();//the money he has
		w=S.nextInt();//the bananas number
		for (int i=1;i<w+1;i++)
		{   c=1;
			c=k*i;
		   j+=c;
		}
		if(n>j)
	    System.out.print(0);
		else
		System.out.print(Math.abs(n-j));

		
	}

}

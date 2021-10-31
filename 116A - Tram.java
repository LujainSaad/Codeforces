import java.util.*;
import java.lang.Math;
import java.util.Arrays;
public class Lujain 
{
	public static void main(String[] args) throws java.lang.Exception
	{	int x,y,n,a = 0;
		Scanner S = new Scanner(System.in);
		n=S.nextInt();
		int [] arr=new int[n];
		for (int i=0;i<n;i++)
		{x=S.nextInt();
		 y=S.nextInt();
		 arr[i]=Math.abs(a+=y-x);}
		Arrays.sort(arr);
		System.out.print(arr[(n-1)]);

		
	}

}

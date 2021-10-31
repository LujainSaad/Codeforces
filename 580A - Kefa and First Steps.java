import java.util.Scanner;
import java.lang.Math;
public class KefaandFirstSteps {
	public static void main (String []args) throws InterruptedException 
	{
		Scanner s=new Scanner(System.in);
        int c=0,x=0,m,n=s.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {    m=c;
        	a[i]=s.nextInt();
        if(i>0)
        	if(a[i]>=a[i-1])
        		{x++;
        		c=Math.max(x, m);}
        		else x=0;
        }
        System.out.print(c+1);
        }
}

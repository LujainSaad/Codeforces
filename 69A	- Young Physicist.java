import java.util.*;
import java.lang.Math;
public class program 
{
	public static void main(String[] args) throws java.lang.Exception
	{	int x,y,z; int xsum=0,ysum=0,zsum=0;int no;	
		Scanner S = new Scanner(System.in);
		no=S.nextInt();
        for(int i=0;i<no;i++)
        {x=S.nextInt();y=S.nextInt();z=S.nextInt();
         xsum+=x; ysum+=y; zsum+=z;}
        if(xsum==0&&ysum==0&&zsum==0)
        	System.out.print("YES");
        else
    	    System.out.print("NO");

	}

}

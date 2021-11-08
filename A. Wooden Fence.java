import java.util.*;
public class fg {
	public static void main(String [] args)
 
	{
		Scanner s=new Scanner (System.in);
		short n=s.nextShort();
		String []arr=new String[n];
		for(short i=0;i<n;i++)
			{
			int x=s.nextInt();
			int y=s.nextInt();
			int z=s.nextInt();
			if(x%2==0)
				{if(x/2<=y&&x/2<=z)
					arr[i]="YES";
				else arr[i]="NO";}
			else 
				if(x/2+1<=y&&x/2<=z)
					arr[i]="YES";
				else arr[i]="NO";
			}
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}

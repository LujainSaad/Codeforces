import java.util.*;
public class GeorgeandAccommodation {
	public static void main (String []args) throws InterruptedException 
	{
		Scanner s=new Scanner(System.in);
		int n,c=0;
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int q=s.nextInt(); int p=s.nextInt();
			if(q<p-1) c++;
		}
		System.out.print(c);
	}
}

import java.util.Scanner;
public class BearandBigBrother {
	public static void main (String []args) throws InterruptedException 
	{
		Scanner s=new Scanner(System.in);
        int x,y,i=0;
        x=s.nextInt();
        y=s.nextInt();
        while(x<=y)
        {x*=3;y*=2; i++;}
        System.out.print(i);
}
}

import java.util.*;
public class Translation {
	public static void main (String []args) throws InterruptedException 
	{
		Scanner s=new Scanner(System.in);
        String c,e,t = "";
        c=s.next();
        e=s.next();
        for (int i=c.length()-1;i>=0;i--)
            t=t+c.charAt(i);
        if(e.equals(t))
        	System.out.println("YES");
        else System.out.println("NO");
        

	}
}

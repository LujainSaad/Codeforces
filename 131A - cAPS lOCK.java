import java.util.*;
public class cAPSlOCK {
	public static void main (String []args) throws InterruptedException 
	{
		Scanner s=new Scanner(System.in);
		String r,t,y,x;
		r=s.next();
		y=r.substring(0,1).toLowerCase()+r.substring(1, r.length()).toUpperCase();
		x=r.toUpperCase();
		if(r.equals(y))
			System.out.println(r.substring(0,1).toUpperCase()+r.substring(1, r.length()).toLowerCase());
		else if(r.equals(x))
			 System.out.println(r.toLowerCase());
		else System.out.println(r);
	}
}


import java.util.*;
import java.lang.Math;
public class program {
	public static void main(String[] args) throws java.lang.Exception
	{ String n,m,t,y;
		Scanner S = new Scanner(System.in);	
		n=S.next();
		m=S.next();
		t=n.toLowerCase();
		y=m.toLowerCase();
		if(t.compareTo(y)==0)
	System.out.println(0);
		else if(t.compareTo(y)>0)
		System.out.println(1);
		else
			System.out.println(-1);
 	}
 
}

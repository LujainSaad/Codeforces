import java.util.*;
import java.lang.Math;
public class program {
	public static void main(String[] args) throws java.lang.Exception
	{	String m; int n; 	
		Scanner S = new Scanner(System.in);	
		m=S.next();
		n=m.length();
       System.out.println(m.substring(0,1).toUpperCase()+m.substring(1,n));
	}

}

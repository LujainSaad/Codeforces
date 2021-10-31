import java.util.*;
import java.lang.Math;
public class Codee {
	public static void main(String[] args) throws java.lang.Exception{
	String n;Boolean c = false;
	Scanner S = new Scanner(System.in);
	n=S.next();
	for(int i=0;i<n.length();i++)
		if(n.contains("H")||n.contains("9")||n.contains("Q"))
		{c=true; break;}
	if(c==true)
			System.out.print("YES");
	else
		System.out.print("NO");
	}

}

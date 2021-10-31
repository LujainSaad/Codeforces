import java.util.*;
public class program {
	public static void main(String[] args) throws java.lang.Exception
	{ String string,s;
		Scanner S = new Scanner(System.in);	
		string=S.next();
		s=string.toLowerCase();
	for(int i=0;i<(s.length());i++)
		{
		if((s.charAt(i))!='a'&&(s.charAt(i))!='i'&&(s.charAt(i))!='u'&&(s.charAt(i))!='o'
		&&(s.charAt(i))!='y'&&(s.charAt(i))!='e')
	System.out.print("."+s.charAt(i));}
 
	}
}

import java.util.*;
import java.lang.Math;
public class program {
	public static void main(String[] args) throws java.lang.Exception
	{	String m; int l = 0; int t=0;	
		Scanner S = new Scanner(System.in);
		m=S.next();
		l=m.length();
        for(int i=0;i<m.length();i++)
            { t=0;
        	for(int j=i;j>=0;j--)
          if(m.charAt(i)==m.charAt(j)&&i!=j)
        		t++;
        if(t!=0)
        	l--;}
        if(l%2==0)
        System.out.print("CHAT WITH HER!");	
        else
        System.out.print("IGNORE HIM!");	
 
	}
 
}

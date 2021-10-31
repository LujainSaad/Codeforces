import java.util.*;
import java.lang.Math;
public class program {
	public static void main(String[] args) throws java.lang.Exception
	{	String s; int m=0;	
		Scanner S = new Scanner(System.in);	
        s=S.next();
        if(s.length()%2!=0)
        m=(int) (Math.floor(s.length()/2)+1);
        else 
        m=s.length()/2;
       char[] Array =new char[m];
       for(int i =0;i<m;i++)
           Array[i]=s.charAt(i*2);
       Arrays.sort(Array);
       for(int i =0;i<m;i++)
    	   if(i==(m-1))
    	  System.out.print(Array[i]);
    	  else
    	  System.out.print(Array[i]+"+");
 
       
	}
 
}

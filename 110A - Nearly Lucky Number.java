import java.util.*;
public class NearlyLuckyNumber {
	public static void main (String []args) throws InterruptedException 
	{
		Scanner s=new Scanner(System.in);
		String S;int c=0;
		S=s.next();
for(int i=0;i<S.length();i++)
	if(S.charAt(i)=='7'||S.charAt(i)=='4')
		c++;
    if (c==7||c==4)
    	System.out.println("YES ");
    else System.out.println("NO");

}
}

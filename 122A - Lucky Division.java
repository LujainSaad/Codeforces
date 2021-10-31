import java.util.*;
public class LuckyDivision {
	public static void main (String []args) throws InterruptedException 
{
	Scanner s=new Scanner(System.in);
    int n,c=0;
    n=s.nextInt();
    int arr[]=new int[]{4,7,44,47,74,77,444,447,474,477,747,774,777};
    for (int i=0;i<arr.length;i++)
    	if(n%arr[i]==0)
    		c++;
    if(c>=1)
    	System.out.println("YES");
    else System.out.println("NO");
}
}

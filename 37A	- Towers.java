import java.util.*;
import java.util.Arrays;
public class Tower {
	public static void main (String []args) throws InterruptedException 
{
	Scanner s=new Scanner(System.in);
	int n,r=0;
	n=s.nextInt();
	int[] arr=new int[1001];
for(int i=0;i<n;i++)
	{int t=s.nextInt();
     arr[t]+=1;}
for(int i=1;i<=1000;i++)
if(arr[i]>=1)
	r++;
System.out.print(Arrays.stream(arr).max().getAsInt());
System.out.print(" "+r);
}
}

import java.util.*;
public class program {
	public static void main(String[] args) throws java.lang.Exception
	{ int n,k,sum=0;
		Scanner S = new Scanner(System.in);
		n=S.nextInt();
		k=S.nextInt();
		int[] Array = new int[n];		
for(int i=0;i<n;i++)
	Array[i]=S.nextInt();
for(int i=0;i<n;i++)
	if((Array[i])>=Array[k-1]&&Array[i]>0)
		sum++;
System.out.print(sum);
 
}
}

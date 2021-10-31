import java.util.*;
public class program {
	public static void main(String[] args) throws java.lang.Exception
	{ int n,sum,sum2=0;
		Scanner S = new Scanner(System.in);	
		n=S.nextInt();
		int[][] arr =new int[n][3];
	for(int i=0;i<n;i++)
	{sum=0;
		for(int j=0;j<3;j++)
		{arr[i][j]=S.nextInt();
         if(arr[i][j]==1)
		sum++;}
	if(sum>=2)
        sum2++;}
	System.out.println(sum2);
	}
}

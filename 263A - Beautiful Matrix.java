import java.util.*;
import java.lang.Math;
public class program {
	public static void main(String[] args) throws java.lang.Exception
	{	int m;	
		Scanner S = new Scanner(System.in);	
       int[][] Array =new int[6][6];
       for(int i=1;i<=5;i++)
           for(int j=1;j<=5;j++)
       Array[i][j]=S.nextInt();
       for(int i=1;i<=5;i++)
           for(int j=1;j<=5;j++)
       if(Array[i][j]==1)
    	   System.out.print((Math.abs(i-3)+Math.abs(j-3)));
       
	}
 
}

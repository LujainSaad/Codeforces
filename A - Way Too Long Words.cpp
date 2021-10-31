import java.util.*;
public class program {
	public static void main(String[] args) throws java.lang.Exception
	{ int n ;
		Scanner S = new Scanner(System.in);
		n=S.nextInt();
		String[] Array = new String[n];		
for(int i=0;i<n;i++)
	Array[i]=S.next();
for(int i=0;i<n;i++)
	Array[i].toLowerCase();
	for(int i=0;i<n;i++)
		if(Array[i].length()<=10)
			System.out.println(Array[i]);
		else
		{{System.out.print(Array[i].charAt(0));	
		System.out.print(Array[i].length()-2);	
		System.out.print(Array[i].charAt(Array[i].length()-1));	}
		System.out.println();	}	
}
}

import java.util.*;
public class Polyhedrons {
	public static void main (String []args) throws InterruptedException 
	{
		Scanner s=new Scanner(System.in);
		int n,e=0;String m;
		n=s.nextInt();
		for(int i=0;i<n;i++) {
			m=s.next();
		switch(m)
		{
		case"Tetrahedron":
			e+=4;
			break;
		case"Cube":
			e+=6;
			break;
		case"Octahedron":
			e+=8;
			break;
		case"Dodecahedron":
			e+=12;
			break;
		case"Icosahedron":
			e+=20;
			break;
		}
		}
		System.out.println(e);
		
	}
}

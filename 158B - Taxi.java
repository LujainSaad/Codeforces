import java.util.*;
public class Taxi {
	public static void main (String []args) throws InterruptedException 
	{
		Scanner s=new Scanner(System.in);
	    int a,n,c1=0,c2=0,c3=0,c4=0,sum=0;
	    n=s.nextInt();
	    for (int i = 0; i < n; i++) {
	        a=s.nextInt();
	        switch (a) {
	            case 1:
	                c1++;
	                break;
	            case 2:
	                c2++;
	                break;
	            case 3:
	                c3++;
	                break;
	            default:
	                c4++;
	                break;
	        }
	    }
	    sum+=c4;
	    sum+=(c2/2);
	    c2=c2%2;
	    if(c1>=c3)
	    {
	    	sum+=c3;
	    	c1=c1-c3;
	    	sum+=c1/4;
	    	c1=c1%4;
	    	if((c1+(c2*2))<=4 && (c1+(c2*2))>0)
	    		sum++;
	    	else if((c1+(c2*2))>4)sum+=2;
	    }
	    else sum+=c3+c2;
	    System.out.println(sum);
	}
}


public class testing {

	public static void main(String args[]) {

		int n=1;
		int b;
		for(int i=0;i<=31;i++){
	    	   b = n&1;
	    	   b = b<<31;
	    	   n=n>>1;

	    	   n= n|b;
	    	   System.out.println(n);
	    	   
    }
     
	       
		}
	}


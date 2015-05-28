import java.util.*;

public class CountPrimes {
	public int countPrimes(int n){
		
		// corner points
	if(n==0 || n ==1 || n==2){
		return 0;
	}
	if(n==3){return 1;}
	if(n==4){return 2;}
		
	int count = n;
	int[] primes= new int[n];
	Arrays.fill(primes,1);
	primes[0]=0;
	count--;
	primes[1]=0;
	count--;
	for(int i=0; i<=(int)Math.sqrt(n); i++){
	     if(primes[i]==1){
	     for(int j = 2; i*j <n; j++){
	           if(primes[i*j]!=0){
	          	primes[i*j]=0;
	                count--;
	            }
	       }
	    }
	  }
	return count;
     }
	
	public boolean isPrime(int numToCheck) {
	    if(numToCheck==1 || numToCheck==0){ return false; }
	    if(numToCheck==2 || numToCheck ==3){return true;}
		int mod = numToCheck%2;
		if(mod==0){ return false;}
		int upperlimit = (int) Math.sqrt(numToCheck);
		for(int i=2;i<upperlimit;i++){
			mod=numToCheck%i;
			if(mod==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPrimes c= new CountPrimes();
		int count = c.countPrimes(100000);
		System.out.println("count of primes : "+count);
	}

}

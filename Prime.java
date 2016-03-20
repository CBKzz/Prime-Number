public class solution{
/*find all the numbers that are smaller than n and is prime with n
we just need to find all the prime factors of n */
	public int prime(int n){
	    	int result=n;
	    	if(n%2==0){
	    		result=result/2;
	    		while(n%2==0) n=n/2;
	    	}
	    	for(int i=3;i<=Math.sqrt(n);i=i+2){
	    		if(n%i==0){
	    			result=result/i*(i-1);
		    		while(n%i==0) n=n/i;
	    		}
	    	}
	    	if(n>2) result=result/n*(n-1);//when n is a prime number
	    	return result;
	}
/*Count the number of prime numbers less than a non-negative number, n.
we can use the brute force way, check if every number is prime. we can do this better*/
	public int countPrimes(int n) {
        if (n<=2) return 0;
        boolean[] result=new boolean[n];
        
        for(int i=2;i<n;i++){
            if(!result[i]) {
                for(int j=i+i;j<n;j+=i){
                    result[j]=true;
                }
            }
        }
        int count =0;
        for (int i=2;i<n;i++){
            if(!result[i]) count++;
        }
        return count;
    	}
//if we say get all the x that satisfies (x-1)!%x==x-1 and x<n, it's the same thing
}

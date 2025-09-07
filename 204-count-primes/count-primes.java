class Solution {
    public int countPrimes(int n) {
        //Brute force approach(TLE)
    //     int count = 0;
    //     for(int i=2; i<n; i++){
    //         if(isPrime(i)){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    //Checking the number is prime or not
    // public boolean isPrime(int num){
    //     for(int i=2; i*i<=num; i++){
    //         if(num % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

        //Sieve of Erantosthenses
        //false means -> Prime
        //true means -> Not Prime
        if(n<=1){
            return 0;
        }
        boolean[] primes = new boolean[n];
        // int count = 0;
        for(int i=2; i*i<=n; i++){
            if(!primes[i]){ //i.e primes[i] == false
                // count++;
                for(int j=i*2; j<n; j+=i){//checking multiples of 2,3 and so on...
                    primes[j] = true;
                }
            }
        }

        int count = 0;
        for(int i=2; i<n; i++){
            if(!primes[i]){
                count++;
            }
        }
        return count;
    }
}
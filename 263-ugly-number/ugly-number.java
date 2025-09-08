class Solution {
    public boolean isUgly(int n) {
        // if(n<=0){
        //     return false;
        // }
        // int[] primefactors ={2, 3, 5};
        // for(int factor : primefactors){
        //     while(n % factor == 0){
        //         n = n / factor;
        //     }
        // }
        // return n == 1;

        if(n<=0){
            return false;
        }
        while(n % 2 == 0)   n = n/2;
        while(n % 3 == 0)   n = n/3;
        while(n % 5 == 0)   n = n/5;

        return n == 1;
    }
}
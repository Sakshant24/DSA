class Solution {
    public double myPow(double x, int n) {
        long N = n; //converting int to long and it handles Integer.MIN_VALUE
        return myPowhelper(x, N);
    }
    private double myPowhelper(double x, long n){
        if(n == 0){
            return 1;
        }

        //for Negative Powers
        if(n < 0){
            x = 1/x;
            n = -n;
        }
        double halfPower = myPowhelper(x, n/2);
        double result = halfPower * halfPower;

        // if n is odd
        if(n % 2 != 0){
            result = x * result;
        }
        return result;
    }
}
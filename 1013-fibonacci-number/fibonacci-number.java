class Solution {
    public int fib(int n) {
        //Recursion Approach #Time Complexity:(Golden Ratio power raise to n) and space complexity:o(n)
        if(n<2){ // or if(n<=1)
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
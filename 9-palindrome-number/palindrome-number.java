class Solution {
    public int reverse(int x){
        int digits = (int)(Math.log10(x)) + 1; //to count digits
        return helper(x, digits);
    }
    private int helper(int x, int digits){
        if(x%10 == x){ // if it is only one digit than return that
            return x; 
        }
        int rem = x % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(x/10, digits-1);
    }
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        return x == reverse(x);
    }
}
class Solution {
    public int numberOfSteps(int num) {
        return helper(num, 0); //Initially steps are zero
    }
    private int helper(int num, int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){ //if num is even divide it by 2
            return helper(num/2,steps+1);
        }
        return helper(num-1, steps+1); //num is odd then subtract 1 from num
    }
}
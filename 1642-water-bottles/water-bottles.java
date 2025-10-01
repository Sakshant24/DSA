class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // return n + (n - 1)/(m - 1);
        int ans = numBottles;
        while(numBottles >= numExchange){
            ans += numBottles / numExchange;
            numBottles = numBottles / numExchange + numBottles % numExchange;
        }
        return ans;
    }
}
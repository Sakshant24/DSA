class Solution {
    public int maximumDifference(int[] nums) {
        //Brute O(n^2)
        int diff = -1;
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] < nums[j]){
                    diff = Math.max(diff, nums[j] - nums[i]);
                }
            }
        }
        return diff;
    }
}
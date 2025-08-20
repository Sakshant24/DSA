class Solution {
    public int xorOperation(int n, int start) {
        //creating new array 
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = start + 2*i;
        }

        //Xor
        int result = nums[0];
        for(int i=1; i<n; i++){
            result ^= nums[i];
        }
        return result;
    }
}
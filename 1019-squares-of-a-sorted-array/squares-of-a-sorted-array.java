class Solution {
    public int[] sortedSquares(int[] nums) {
        //Two Pointers Approach
        // int left = 0;
        // int right = nums.length-1;
        // int index = nums.length-1;
        // int[] result = new int[nums.length];
        // while(left <= right){
        //     if(Math.abs(nums[left]) > Math.abs(nums[right])){
        //         result[index] = nums[left]*nums[left];
        //         left++;
        //     }
        //     else{
        //         result[index] = nums[right]*nums[right];
        //         right--;
        //     }
        //     index--;
        // }
        // return result;

        int left = 0;
        int right = nums.length-1;
        int[] result = new int[nums.length];

        for(int i=nums.length-1; i>=0; i--){//Starting from last index or Reversing the loop for    non-decreasing order of array
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[i] = nums[left]*nums[left];
                left++;
            }
            else{
                result[i] = nums[right]*nums[right];
                right--;
            }
        }
        return result;
    }
}
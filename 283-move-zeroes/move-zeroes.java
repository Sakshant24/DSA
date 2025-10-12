class Solution {
    public void moveZeroes(int[] nums) {
        //non zero element swapping i.e using two ptrs initializing them as 0 first
        int left = 0;
        for(int right=0; right<nums.length; right++){
            if(nums[right] != 0){
                //swap
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
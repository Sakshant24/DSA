class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        //reverses the first part of array(1st half)
        reverse(nums,0,n-k-1);

        reverse(nums,n-k,n-1);//reverses the second part of array(2nd half i.e right)

        reverse(nums,0,n-1);//reverse whole array
    }
    public void reverse(int[] nums, int i, int j){
        while(i<j){
            //swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
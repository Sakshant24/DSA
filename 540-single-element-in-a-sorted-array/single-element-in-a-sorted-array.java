class Solution {
    public int singleNonDuplicate(int[] nums) {
       int start = 0, end = nums.length-1;
       while(start<end){
        int mid = start + (end-start)/2;
        if(mid % 2 ==1){
            mid--;
        }
        if(nums[mid] != nums[mid+1]){
            end = mid; //element is in left part 
        }
        else{
            start = mid+2; //element is in right part
        }
       }
       return nums[start]; //when start = end single element is found 
    }
}
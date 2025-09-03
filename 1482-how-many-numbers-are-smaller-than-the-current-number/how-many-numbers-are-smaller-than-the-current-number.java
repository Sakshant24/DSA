class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //Brute Force Approach 
        int arr[] = new int[nums.length]; //declaration of new array
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
                arr[i] = count;//storing the count of elements that are smaller than current element
            }
        }
        return arr; 
    }
}
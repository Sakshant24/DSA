class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i=0; i<n; i++){
        //     nums1[i+m] = nums2[i];
        // }
        // Arrays.sort(nums1);

        int i = m-1;//last element index of nums1
        int j = n-1;//last element index of nums2 
        int k = m+n-1;//last ele index of merged array

        while(j >= 0){
            if(i >=0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--]; //if nums1 element is bigger than put it on last 
            }
            else{
                nums1[k--] = nums2[j--]; //and if nums2 element is bigger or eq put it on last 
            }
        }
    }
}
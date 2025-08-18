class Solution {
    public boolean isPerfectSquare(int num) {
       int start = 1, end = num;
       while(start<=end){
            int mid = start + (end-start)/2;
            if((long)mid * mid < num){
                start = mid + 1;
            }
            else if(mid * mid == num){
                return true;
            }
            else{
                end = mid-1;
            }
       }
       return false;
    }
}
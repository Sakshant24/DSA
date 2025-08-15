class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int start = 1;
        int end = x;
        while(start<=end){
            int mid = start +(end-start)/2;
            if((long)mid * mid < x){
                start = mid + 1; //right 
            }
            else if(mid * mid == x){
                return mid;
            }
            else{
                end = mid-1; //left
            }
        }
        return end;
    }
}
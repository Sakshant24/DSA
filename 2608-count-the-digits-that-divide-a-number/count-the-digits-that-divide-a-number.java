class Solution {
    public int countDigits(int num) {
        int count = 0;
        int temp = num;
        while(temp > 0){
            int digit = temp%10;//getting the last digit of no. 
            if(num % digit == 0){
                count++;
            }
            temp /= 10;//removing that no.
        }
        return count;
    }
}
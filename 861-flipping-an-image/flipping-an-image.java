class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            //reversing the array
            for(int i=0; i<(image[0].length+1)/2; i++){
                //swap
                int temp = row[i] ^ 1; // xor of any no. with one give inverse of that no.
                row[i] = row[image[0].length-i-1] ^1;
                row[image[0].length-i-1] = temp;
            }
        }
        return image;
    }
}
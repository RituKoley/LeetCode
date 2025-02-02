class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        // Traverse the array from the end to the beginning
        for(int i=n-1; i>=0; i--){
            // If the current digit is less than 9, increment and return the result
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            // If the digit is 9, set it to 0 and continue to the next digit
            digits[i] = 0;
        }
         // If all digits were 9, we need a new array with an additional digit
        int newNum [] = new int[n+1];
        newNum[0] = 1;// Set the first digit to 1, all others are initialized to 0
        return newNum;
    }
}
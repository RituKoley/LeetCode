class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        // Iterate over both strings from right to left
        while (i >= 0 || j >= 0) {
            int sum = carry;
            // If there are still characters in string a, add the corresponding binary digit
            if (i >= 0) {
                sum += a.charAt(i) - '0';  // Convert char to int (either 0 or 1)
                i--;
            }
            // If there are still characters in string b, add the corresponding binary digit
            if (j >= 0) {
                sum += b.charAt(j) - '0';  // Convert char to int (either 0 or 1)
                j--;
            }
            // Add the sum modulo 2 (either 0 or 1) to the result
            result.append(sum % 2);
            // Update the carry (either 0 or 1)
            carry = sum / 2;
        }
        // If there's still a carry, append it to the result
        if (carry != 0) {
            result.append(carry);
        }
        // Reverse the result since we've added digits from the least significant end
        return result.reverse().toString();
    }
}
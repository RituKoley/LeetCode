class Solution {
    public boolean isValid(String s) {
        // Continuously replace valid pairs until no further replacements can be made
        int length;
        
        do {
            length = s.length(); // Record the current length of the string
            // Replace valid pairs: (), {}, []
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            // Repeat until the length of the string stops changing
        } while (length != s.length());

        // If the string is empty after removing all valid pairs, it's valid
        return s.isEmpty();
    }
}
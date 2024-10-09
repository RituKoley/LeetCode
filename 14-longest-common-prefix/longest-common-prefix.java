class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        //initialize prefix value 
        String prefix = strs[0];
        //compare prefix with each string 
        for(int i=1; i < strs.length; i++){
            //Update the prefix by comparing it with the current string
            while(strs[i].indexOf(prefix) != 0){
                // Reduce the prefix length by one character at a time
                prefix = prefix.substring(0, prefix.length() - 1);
                //if prefix empty, return empty string
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
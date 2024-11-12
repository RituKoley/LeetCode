class Solution {
    public boolean isHappy(int n) {
        int result = n;
        
        while (result != 1 && result != 4) {  // Continue until we reach 1 (happy) or 4 (unhappy cycle)
            result = Find_sum(result);
        }
        
        return result == 1;
    }
    public int Find_sum(int n){
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
    
}
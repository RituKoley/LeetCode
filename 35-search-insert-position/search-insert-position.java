class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while(left <= right){
            mid = left + (right - left) / 2;
            if(nums[mid] == target){ // target found at index mid
                return mid;
            }else if(nums[mid] < target){
                left = mid+1; // search right half
            }else{
                right = mid-1; // search left half
            }
        }
        // If target is not found, 'left' will be the insertion point
        return left;
    }
}
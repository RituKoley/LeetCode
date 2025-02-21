class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;  //lastUniqueIndex
        for(int i=1; i<nums.length; i++){ //_,1,2
            if(nums[k] != nums[i]){  //1 == 1 false, 1 == 2
                nums[k+1] = nums[i]; //,        nums[1]=2
                k++;                //1
            }//nums[0]=1, nums[1]=2,  _
        }
        return k+1;  //1+1=2 , 0 1 2, 1,2,_
    }
}
// TC = O(n) SC = O(1)
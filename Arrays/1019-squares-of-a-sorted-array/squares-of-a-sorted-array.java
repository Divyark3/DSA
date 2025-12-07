class Solution {
    public int[] sortedSquares(int[] nums) {

        for(int n=0; n<nums.length; n++){
            nums[n] = nums[n] * nums[n];
        }
        Arrays.sort(nums);
        
        return nums;
        
    }
}
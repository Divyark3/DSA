class Solution {
    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int end=0, start=0;
        int zero=0, max=0;

        while(end<n){

            if(nums[end] == 0){
                zero++;
            }

            if(zero >k){
                if(nums[start] == 0){
                    zero--;
                }
                start++;
            }
            max = Math.max(max, end-start+1);
            end++;
        }
        return max;
        
    }
}
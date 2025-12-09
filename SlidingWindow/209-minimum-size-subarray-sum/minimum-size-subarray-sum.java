class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;

        int end = 0, start = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(end=0; end<n; end++){
            sum+=nums[end];

            while(sum >= target){
                min = Math.min(min, end-start+1);
                sum -= nums[start];
                start++;
            }
        }

        return min!=Integer.MAX_VALUE? min : 0;

        
    }
}
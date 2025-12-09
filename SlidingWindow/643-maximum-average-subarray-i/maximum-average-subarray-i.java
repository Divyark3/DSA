class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int end = 0;
        double sum = 0;
        double max = 0;

        for(end=0; end<k; end++){
            sum += nums[end];
        }

        max = sum;

        for(end=k; end<n; end++){
            sum = sum - nums[end-k] + nums[end];
            max = Math.max(max, sum);

        }
        return max/k;
        
    }
}
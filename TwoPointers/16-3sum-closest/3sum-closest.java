class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i=0; i<n-2; i++){

            int j = i+1;
            int k = n-1;

            while(j < k){
                
                sum = nums[i] + nums[k] + nums[j];

                if(Math.abs(target - min) > Math.abs(target - sum)){
                    min = sum;
                }

                if(sum > target){
                    k--;
                }
                else if(sum < target){
                    j++;
                }
                else{
                    return sum;
                }
            }
        }
        return min;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){

            int cur = target-nums[i];

            if(map.containsKey(cur)){
                return new int[]{map.get(cur), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int n = nums.length;

        List<Integer> res = new ArrayList<>();

        for(int i=0; i<n; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0){
                nums[index] = -nums[index];
            }
        }

        for(int j=0; j<n; j++){
            if(nums[j] >= 0){
                res.add(j+1);
            }
        }
        return res;
        
    }
}
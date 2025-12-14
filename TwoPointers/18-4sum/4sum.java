class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n = nums.length;
        long sum = 0;
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<n-1; i++){
            
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            for(int j = i+1; j<n; j++){

                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }

                int l = j+1;
                int r = n-1;

                while(l<r){
                    sum = (long)nums[i] + nums[j] + nums[l] + nums[r];

                    if(sum == target){
                        res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                        while(l<r && nums[l] == nums[l-1]) l++;
                        while(l<r && nums[r] == nums[r+1]) r--;
                    }
                    else if(sum < target){
                        l++;
                    }
                    else{
                        r--;
                    }
                    
                }
            }
        }
        return res;
        
    }
}
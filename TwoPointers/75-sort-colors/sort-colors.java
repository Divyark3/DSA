class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;
        int r = 0;
        int w = 0;
        int b = n-1;

        for(int red=0; red<n; red++){

            if(nums[w] == 0){
                int temp = nums[w];
                nums[w] = nums[r];
                nums[r] = temp;
                r++;
                w++;
            }
            else if(nums[w] == 2){
                int temp = nums[w];
                nums[w] = nums[b];
                nums[b] = temp;
                b--;
            }
            else{
                w++;
            }
        }
    }
}
class Solution {
    public int thirdMax(int[] nums) {

        int len = nums.length;
        long m1 = Long.MIN_VALUE;
        long m2 = Long.MIN_VALUE;
        long m3 = Long.MIN_VALUE;

        for(int n=0; n<len; n++){

            if(m1 < nums[n]){
                m3 = m2;
                m2 = m1;
                m1 = nums[n];
            }
            else if( m2 < nums[n] && nums[n] != m1){
                m3 = m2;
                m2 = nums[n];
            }
            else if( m3 < nums[n] && nums[n] != m1 && nums[n] != m2){
                m3 = nums[n];
            }

        }

        return m3 != Long.MIN_VALUE? (int)m3 : (int)m1;

        
    }
}
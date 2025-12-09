class Solution {
    public int thirdMax(int[] nums) {

        long m1 = Long.MIN_VALUE;
        long m2 = Long.MIN_VALUE;
        long m3 = Long.MIN_VALUE;

        for(int n:nums){

            if(m1 < n){
                m3 = m2;
                m2 = m1;
                m1 = n;
            }
            else if( m2 < n && n != m1){
                m3 = m2;
                m2 = n;
            }
            else if( m3 < n && n != m1 && n != m2){
                m3 = n;
            }

        }

        return m3 != Long.MIN_VALUE? (int)m3 : (int)m1;

        
    }
}
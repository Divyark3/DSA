class Solution {
    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        while(true){

            slow = getSum(slow);
            fast = getSum(getSum(fast));

            if(slow == fast){
                break;
            }
        }    
        return slow == 1;    
    }

    private int getSum(int num){

        int sum = 0;

        while(num > 0){
            int r = num%10;
            sum += r*r;
            num = num/10;
        }
        return sum;
    }
}
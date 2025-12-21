class Solution {
    
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue;
            
            boolean isForward = nums[i] > 0;
            int slow = i, fast = i;
            
            while (true) {
                slow = getNext(nums, slow, isForward);
                if (slow == -1) break;
                
                fast = getNext(nums, fast, isForward);
                if (fast == -1) break;
                fast = getNext(nums, fast, isForward);
                if (fast == -1) break;
                
                if (slow == fast) {
                    if (slow == getNext(nums, slow, isForward)) {
                        break;
                    }
                    return true;
                }
            }
            
            slow = i;
            int val = nums[i];
            while (val * nums[slow] > 0) {
                int next = (slow + nums[slow]) % nums.length;
                if (next < 0) next += nums.length;
                nums[slow] = 0;
                slow = next;
            }
        }
        
        return false;
    }
    
    private int getNext(int[] nums, int current, boolean isForward) {
        int n = nums.length;
        boolean direction = nums[current] > 0;
        
        if (direction != isForward) return -1;
        
        int next = (current + nums[current]) % n;
        
        if (next < 0) next += n;
        
        if (next == current) return -1;
        
        return next;
    }
}
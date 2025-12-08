class Solution {
    public int[] replaceElements(int[] arr) {

        int n = arr.length;
        int max = arr[n-1];

        arr[n-1] = -1;

        for(int i=n-2; i>-1; i--){
            int cur = arr[i];
            arr[i] = max;
            max = Math.max(max, cur);
        }

        return arr;
        
    }
}
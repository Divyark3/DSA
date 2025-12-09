class Solution {
    public int heightChecker(int[] heights) {

        int n = heights.length;
        int count = 0;

        int[] dup = new int[n];

        for(int i=0; i<n; i++){
            dup[i] = heights[i];
        }

        Arrays.sort(dup);

        for(int i=0; i<n; i++){
            if(dup[i] != heights[i]){
                count++;
            }
        }
        return count;

        
    }
}
class Solution {
    public int characterReplacement(String s, int k) {

        int n = s.length();
        int end=0, start=0;
        int max=0, maxr=0;

        int[] arr = new int[26];

        for(end=0; end<n; end++){

            char c = s.charAt(end);
            arr[c - 'A'] = arr[c - 'A'] + 1;

            maxr = Math.max(maxr, arr[c - 'A']);

            if(end-start+1-maxr > k){
                char ch = s.charAt(start);
                arr[ch - 'A'] -= 1;
                start++;
            }

            max = Math.max(max, end-start+1);
        }
        return max;
        
    }
}
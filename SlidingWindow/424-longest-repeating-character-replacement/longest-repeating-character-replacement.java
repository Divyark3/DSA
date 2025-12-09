class Solution {
    public int characterReplacement(String s, int k) {
        
        int n = s.length();
        int end=0, start=0;
        int max=0;
        int maxrep=0;

        Map<Character, Integer> map = new HashMap<>();

        for(end=0; end<n; end++){
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c,0) + 1);

            maxrep = Math.max(maxrep, map.get(c));

            if(end-start+1-maxrep > k){
                char ch = s.charAt(start);
                map.put(ch, map.get(ch) - 1);
                start++;
            }

            max = Math.max(max, end-start+1);
        }
        return max;
    }
}
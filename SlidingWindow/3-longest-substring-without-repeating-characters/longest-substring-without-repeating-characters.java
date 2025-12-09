class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int end=0, start=0;
        int max=0;

        Map<Character, Integer> map = new HashMap<>();

        for(end=0; end<n; end++){

            char c = s.charAt(end);

            map.put(c, map.getOrDefault(c,0) + 1);

            while(map.get(c) > 1){
                char ch = s.charAt(start);
                map.put(ch, map.get(ch) - 1);
                start++;

            }

            max = Math.max(max, end-start+1);

        }
        return max;
        
    }
}
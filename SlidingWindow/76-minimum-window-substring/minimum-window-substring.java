class Solution {
    public String minWindow(String s, String t) {

        int n = t.length();
        int m = s.length();

        if(n > m) return "";

        int end=0;
        int start=0;
        int st=-1;
        int match=n;
        int min=Integer.MAX_VALUE;

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        while(end < m){

            char c = s.charAt(end);

            if(map.containsKey(c)){
                map.put(c, map.get(c) - 1);
                if(map.get(c) >= 0){
                    match--;
                }
            }

            while(match == 0){

                if(end-start+1 < min){
                    min = end-start+1;
                    st = start;
                }

                char ch = s.charAt(start);

                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch) + 1);
                    if(map.get(ch) > 0){
                        match++;
                    }

                }
                start++;
            }
            end++;
        }

        return (st == -1) ? "" : s.substring(st, st + min);
        
    }
}
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int n = p.length();
        int m = s.length();

        int start=0, end=0;

        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        List<Integer> res = new ArrayList<>();

        for(end=0; end<n; end++){
            char c = p.charAt(end);
            m1.put(c, m1.getOrDefault(c,0) + 1);
        }

        for(end=0; end<m; end++){
            char c = s.charAt(end);
            m2.put(c, m2.getOrDefault(c, 0) + 1);

            if(end-start+1 > n){

                char ch = s.charAt(start);
                m2.put(ch, m2.get(ch) - 1);

                if(m2.get(ch) == 0){
                    m2.remove(ch);
                }
                start++;
            }

            if(end-start+1 == n && m2.equals(m1)){
                res.add(start);
            }
        }
        return res;
        
    }
}
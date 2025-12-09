class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        int end=0, start=0;

        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for(end=0; end<n; end++){
            m1.put(s1.charAt(end), m1.getOrDefault(s1.charAt(end), 0) + 1);
        }

        for(end=0; end<m; end++){
            m2.put(s2.charAt(end), m2.getOrDefault(s2.charAt(end), 0) + 1);

            while(end - start + 1 > n){
                char c = s2.charAt(start);
                m2.put(c, m2.get(c) - 1); 
                if(m2.get(c) == 0){
                    m2.remove(c);
                }
                start++;

            }

            if(end-start+1 == n && m2.equals(m1)){
                return true;
            }
        }
        return false;


        
    }
}
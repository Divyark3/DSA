class Solution {
    public int romanToInt(String s) {
        
        int n = s.length();
        int r=0;
        Map<Character, Integer> res = new HashMap<>();

        res.put('I', 1);
        res.put('V', 5);
        res.put('X', 10);
        res.put('L', 50);
        res.put('C', 100);
        res.put('D', 500);
        res.put('M', 1000);

        for(int i=0; i<n-1; i++){
            if(res.get(s.charAt(i)) < res.get(s.charAt(i+1))){
                r -= res.get(s.charAt(i));
            }
            else{
                r += res.get(s.charAt(i));
            }
        }
        return r + res.get(s.charAt(n-1));


    }
}
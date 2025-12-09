class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;

        String pref = strs[0];
        int prefl = pref.length();

        for(int i=1; i<n; i++){

            String s = strs[i];

            while(prefl > s.length() || !pref.equals(s.substring(0, prefl))){
                prefl--;
                if(prefl == 0){
                    return "";
                }
                pref = pref.substring(0, prefl);
            }
        }

        return pref;
        
    }
}
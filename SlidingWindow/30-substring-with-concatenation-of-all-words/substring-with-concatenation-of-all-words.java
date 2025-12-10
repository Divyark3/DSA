class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        int len = s.length();
        int wc = words.length;
        int ws = words[0].length();

        int end=0, start=0;
        int count=0;

        Map<String, Integer> wmap = new HashMap<>();

        for(int i=0; i<wc; i++){
            wmap.put(words[i], wmap.getOrDefault(words[i], 0) + 1);
        }

        List<Integer> res = new ArrayList<>();

        for(int offset=0; offset<ws; offset++){
            start = offset;
            count = 0;

            Map<String, Integer> cmap = new HashMap<>();

            for(end=offset; end+ws <= len; end+=ws){
                String cur = s.substring(end, end + ws);

                if(wmap.containsKey(cur)){
                    cmap.put(cur, cmap.getOrDefault(cur, 0) + 1);
                    count++;

                    while(cmap.get(cur) > wmap.get(cur)){
                        String st = s.substring(start, start+ws);
                        cmap.put(st, cmap.get(st) - 1);
                        start+=ws;
                        count--;

                    }

                    if(count == wc){
                        res.add(start);
                    }
                }
                else{
                    count = 0;
                    start = end+ws;
                    cmap.clear();
                }

            }

        }
        return res;
        
    }
}
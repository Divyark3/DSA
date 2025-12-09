class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length;
        int end=0, start=0;
        int max=0;
        int cur=0;

        Map<Integer, Integer> map = new HashMap<>();

        for(end=0; end<n; end++){
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);

            while(map.size() > 2){
                map.put(fruits[start], map.get(fruits[start]) - 1);
                if(map.get(fruits[start]) == 0){
                    map.remove(fruits[start]);
                }
                start++;
            }

            cur = end-start+1;
            max = Math.max(max, cur);

        }
        return max;
    }
}
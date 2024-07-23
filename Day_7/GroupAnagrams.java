class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , ArrayList<String> > map = new HashMap<>();

        for(String curr : strs){
            char[] temp = curr.toCharArray();
            Arrays.sort(temp);

            String key = new String(temp);
            if(!map.containsKey(key)){
                map.put(key , new ArrayList<>());
            }

            map.get(key).add(curr);
        }

        return new ArrayList<>(map.values());
    }
}
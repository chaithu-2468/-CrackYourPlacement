class Solution {
    public List<List<String>> Anagrams(String[] arr) {
        // Code here
        LinkedHashMap<String , ArrayList<String> > map = new LinkedHashMap<>();
        
        for(String str  : arr){
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            
            String key = new String(temp);
            
            if(!map.containsKey(key)){
                map.put(key , new ArrayList<>());
            }
            
            map.get(key).add(str);
        }
        
        
        return new ArrayList<>(map.values());
    }
}

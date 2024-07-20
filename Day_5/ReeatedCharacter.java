class Solution
{
    char firstRep(String S)
    {
        // your code here
        char ch = '#';
        int minidx = S.length();
        LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();
        
        for(int i=0 ; i<S.length() ; i++){
            char curr = S.charAt(i);
            
            if(map.containsKey(curr)){
                if(minidx > map.get(curr)){
                    ch = curr;
                    minidx = map.get(curr);
                }
            }
            else{
                map.put(curr , i);
            }
        }
        return ch;
    }
}
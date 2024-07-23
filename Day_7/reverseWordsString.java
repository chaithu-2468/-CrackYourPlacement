class Solution {
    public String reverseWords(String s1) {
        s1=s1.trim();
        String[] str = s1.split("\\s+");
         StringBuilder sb = new StringBuilder();
        for(int i=str.length-1 ; i>0 ; i--){
            
            sb.append(str[i]).append(" ");
        }

        return sb.append(str[0]).toString();
        
    }
}
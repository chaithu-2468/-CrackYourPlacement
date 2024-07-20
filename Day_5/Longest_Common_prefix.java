class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length ;
        if(n==0)    return "";

        Arrays.sort(strs);

        String s1 = strs[0];
        String s2 = strs[n-1];

        StringBuilder ans = new StringBuilder();

        for(int i=0 ; i< Math.min(s1.length() , s2.length()) ; i++){

            if(s1.charAt(i) != s2.charAt(i))    return ans.toString();

            ans.append(s1.charAt(i));
        }

        return ans.toString();
    }
}
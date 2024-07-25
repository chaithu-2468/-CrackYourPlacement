class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int ans = 0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0 || ans==1){
            if(i>=0){
                ans=ans+a.charAt(i)-'0';
            }
            if(j>=0){
                ans=ans+b.charAt(j)-'0';
            }

            sb.append(ans%2);
            ans=ans/2;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
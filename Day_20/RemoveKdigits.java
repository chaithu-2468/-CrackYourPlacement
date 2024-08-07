class Solution {
    public String removeKdigits(String num, int k) {
        // StringBuilder s = new StringBuilder(num);
        // int i = 0;
        // while (k > 0 && i < s.length() - 1) {
        //     if (s.charAt(i) > s.charAt(i + 1)) {
        //         s.delete(i, i + 1);
        //         k--;
        //         if (i > 0) {
        //             i--;
        //         }
        //     } else {
        //         i++;
        //     }
        // }
        
        // // If there are remaining digits to be removed, remove them from the end
        // while (k > 0 && s.length() > 0) {
        //     s.deleteCharAt(s.length() - 1);
        //     k--;
        // }
        
        // // Remove leading zeros
        // while (s.length() > 1 && s.charAt(0) == '0') {
        //     s.deleteCharAt(0);
        // }
        
        // return s.length() == 0 ? "0" : s.toString();


        Stack<Character> st = new Stack<>();

        for(char ch : num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }

        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty())    sb.append(st.pop());

        StringBuilder ans = sb.reverse();
        int s=-1;
        for(int i=0 ; i<ans.length() ; i++){
            if(ans.charAt(i) != '0'){
                s=i;
                break;
            }
        }

        if(s==-1)   return "0";
        return ans.substring(s);
        
    }
}
class Solution {
    static class Pair{
        char ch;
        int val;
        Pair(char ch , int val){
            this.ch = ch;
            this.val = val;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();

        for(char curr : s.toCharArray()){
            if(st.isEmpty())    st.push(new Pair(curr , 1));

            else{
                Pair peek = st.pop();
                if(peek.ch == curr){
                    st.push(new Pair(curr , peek.val+1));
                    if(st.peek().val == k)  st.pop();
                }
                else{
                    st.push(peek);
                    st.push(new Pair(curr , 1));
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            Pair curr = st.pop();
            sb.append(String.valueOf(curr.ch).repeat(curr.val));
        }

        return sb.reverse().toString();
    }
}
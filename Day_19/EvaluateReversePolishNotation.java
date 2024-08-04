class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String str : tokens){
            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){

                int a = st.pop();
                int b = st.pop();

                if(str.equals("+")) st.push(b+a);
                else if(str.equals("-")) st.push(b-a);
                else if(str.equals("*")) st.push(b*a);
                else if(str.equals("/")) st.push(b/a);
            }

            else{
                st.push(Integer.parseInt(str));
            }
        }

        return st.peek();
    }
}

class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        
        Stack<Integer> st = new Stack<>();
        
        for(char ch : S.toCharArray()){
            char curr = ch;
            if(Character.isDigit(curr)) st.push(curr - '0');
            else{
                int a = st.pop();
                int b = st.pop();
                
                if(ch == '+')   st.push(a+b);
                else if(ch == '*')  st.push(a*b);
                else if(ch == '-')  st.push(b-a);
                else if(ch == '/')  st.push(b/a);
            }
        }
        
        return st.pop();
    }
}
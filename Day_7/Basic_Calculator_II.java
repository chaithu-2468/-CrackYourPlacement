class Solution {
    public int calculate(String s) {
        int len = s.length();
        int num = 0;
        char sign = '+';
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            
            if (!Character.isDigit(ch) && ch != ' ' || i == len - 1) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                
                num = 0;
                sign = ch;
            }
        }
        
        int result = 0;
        for (int i : stack) {
            result += i;
        }
        
        return result;
    }
}
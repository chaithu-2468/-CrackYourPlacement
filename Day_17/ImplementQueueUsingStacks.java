class MyQueue {
    static Stack<Integer> st1 ;
    static Stack<Integer> st2 ;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        peek();
        return st2.pop();
    }
    
    public int peek() {
        if(!st2.isEmpty()){
            return st2.peek();
        }
        else{
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
        return st2.peek();
    }
    
    public boolean empty() {
        return ( st1.size() == 0 && st2.size() == 0) ;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
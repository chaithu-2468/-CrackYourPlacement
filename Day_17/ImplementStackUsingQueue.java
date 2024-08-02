class MyStack {
    static Queue<Integer> qu;
    public MyStack() {
        qu = new LinkedList<>();
    }
    
    public void push(int x) {
        if(qu.size() == 0){
            qu.offer(x);
            return ;
        }
        qu.offer(x);
        int size = qu.size();
        for(int i=0 ; i<size-1 ; i++){
            qu.offer(qu.poll());
        }
    }
    
    public int pop() {
        return qu.poll();
    }
    
    public int top() {
        return qu.peek();
    }
    
    public boolean empty() {
        return qu.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
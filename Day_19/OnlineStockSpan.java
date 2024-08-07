class StockSpanner {
    static class Pair{
        int val;
        int span;
        Pair(int val , int span){
            this.val = val;
            this.span = span;
        }
    }

    Stack<Pair> st ;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!st.isEmpty() && st.peek().val <= price){
            Pair curr = st.pop();
            span += curr.span;
        }
        st.push(new Pair(price , span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
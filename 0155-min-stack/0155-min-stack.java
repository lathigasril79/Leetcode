class MinStack {
    Stack<Integer> st;

    public MinStack() {
         st = new Stack<>();
        
    }
    
    public void push(int val) {
        st.push(val);
        
    }
    
    public void pop() {
        st.pop();
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Iterator<Integer> it= st.iterator();
        int min = Integer.MAX_VALUE;
        while(it.hasNext())
        {
            int temp = it.next();
            if(min>temp)
            min = temp;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
class StockSpanner {

    Stack<Integer> stack;
    ArrayList<Integer> list;
    public StockSpanner() { 
        stack = new Stack<>();
        list = new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);

        while(!stack.isEmpty() && list.get(stack.peek()) <= price){
            stack.pop();
        }

        int previousGreaterIdx = (stack.isEmpty())?-1:stack.peek();
        int currentIdx = list.size()-1;
        int ans = currentIdx - previousGreaterIdx;
        stack.push(currentIdx);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
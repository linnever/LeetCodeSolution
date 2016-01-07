// using one stack
class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    int min = Integer.MAX_VALUE;
    public void push(int x) {
        if(x <= min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.peek() == min){
            stack.pop();
            min = stack.peek();
            stack.pop();
        }
        else
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
//using two stack
class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minstack = new Stack<Integer>();
    public void push(int x) {
        if(minstack.isEmpty() || x <= minstack.peek()){
            minstack.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.peek().equals(minstack.peek())){
            minstack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}

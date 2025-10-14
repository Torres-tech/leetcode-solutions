import java.util.Stack;

class MinStack {
    Stack<Integer> s = new Stack<>();      // main stack (values)
    Stack<Integer> mins = new Stack<>();   // parallel stack (min so far at each depth)

    public MinStack() { //MinStack() creates the variable inside the Object once it is created (Object: s, mins)
    }

    public void push(int val) {
        s.push(val);
        // if parallel stack is empty, push the value inside the parallel stack
        if (mins.isEmpty()) { 
            mins.push(val);} 
        else {
            mins.push(Math.min(val, mins.peek())); //if not, compare min between current val and the top of parallel stack
        }
    }
    // pop both of stacks
    public void pop() {
        s.pop();
        mins.pop();
    }

    public int top() {
        return s.peek();
    }
    // get min of the stack by looking the top of parallel stack
    public int getMin() {
        return mins.peek();
    }
}

import java.util.Stack;

class MinStack {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    /** initialize your data structure here. */
    public MinStack() {
        this.stackData=new Stack<Integer>();
        this.stackMin=new Stack<Integer>();
    }

    public void push(int x) {
        if (this.stackMin.isEmpty()) {
            this.stackMin.push(x);
        }else if (x<=this.getMin()){
            this.stackMin.push(x);
//        }else {
//                int newMin=this.stackMin.peek();
//                this.stackMin.push(newMin);
        }
        this.stackData.push(x);
    }

    public void pop() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        }
        int value=this.stackData.pop();
        if(value==this.getMin())
            this.stackMin.pop();
    }

    public int top() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        }
        return this.stackData.peek();

    }

    public int getMin() {
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty");
        }
        return this.stackMin.pop();
    }


    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
//
//        System.out.println(minStack.getMin());
//        minStack.push(2);
//        minStack.push(1);
//        minStack.push(3);
//        int param_1=minStack.top();
//        System.out.println(param_1);
//        int param_2=minStack.getMin();
//        System.out.println(param_2);
//        minStack.pop();
//        int param_3=minStack.getMin();
//        System.out.println(param_3);

    }



}




/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
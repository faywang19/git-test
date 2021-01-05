import java.util.Stack;

public class MyStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack(){
        this.stackData=new Stack<Integer>();
        this.stackMin=new Stack<Integer>();
    }
    public void push(int newNum){
        if(this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if(newNum<=this.getMin()){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop(){
        if(this.stackData.isEmpty()){
            throw new RuntimeException("your stack is empty");
        }
        int value=this.stackData.pop();
        if (value==this.getMin()){
            this.stackMin.pop();
        }
        return value;
    }

    public int getMin(){
        if (this.stackMin.isEmpty())
            throw new RuntimeException("your stack is empty");
        return this.stackMin.peek();
    }

    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(0);
        System.out.println(myStack.getMin());
        myStack.push(7);
        System.out.println(myStack.getMin());
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.getMin());
    }



}



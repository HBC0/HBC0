import datestructure.stack.MyStack;

public class TestMyStack {
    public static void main(String[] args) {
        //创建一个栈
        MyStack myStack = new MyStack();
        System.out.println(myStack.isEmpty());
        //压入数组
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
//        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
    }
}

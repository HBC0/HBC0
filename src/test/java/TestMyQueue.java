import datestructure.queue.MyQueue;

public class TestMyQueue {
    public static void main(String[] args) {
        //创建队列
        MyQueue myQueue = new MyQueue();

        System.out.println(myQueue.isEmpty());

        //入队
        myQueue.add(200);
        myQueue.add(211);
        myQueue.add(284);

        //出队
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.poll());

        System.out.println(myQueue.isEmpty());
    }
}

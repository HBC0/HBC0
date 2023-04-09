package datestructure.queue;

import java.awt.*;

public class MyQueue {
    int[] elements;

    public MyQueue() {
        elements = new int[0];
    }

    //入队
    public void add(int element){
        //创建一个新数组
        int[] newArr = new int[elements.length + 1];
        //把原数组中的元素添加到新数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //把新元素添加到数组
        newArr[elements.length] = element;
        //使用新数组代替旧数组
        elements = newArr;
    }

    //出队
    public int poll(){

        //取出数组第0个元素
        int element = elements[0];

        //创建一个新数组
        int[] newArr = new int[elements.length-1];
        //复制原数组中的元素添加到新数组中
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i+1];
        }
        //使用新数组代替旧数组
        elements = newArr;
        return element;
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return elements.length==0;
    }
}

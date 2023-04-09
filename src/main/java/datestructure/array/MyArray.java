package datestructure.array;

import java.util.Arrays;

public class MyArray {

    //用于存储数据的数组
    private Object[] elements;

    public MyArray() {
        elements = new Object[0];
    }

    //获取数组长度的方法
    public int size() {
        return elements.length;
    }

    //往数组末尾添加一个元素
    public void add(Object element) {

        //创建一个新数组
        Object[] newArr = new Object[elements.length + 1];
        //把原数组中的元素添加到新数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //把新元素添加到数组
        newArr[elements.length] = element;
        //使用新数组代替旧数组
        elements = newArr;
    }

    //打印所有元素到控制台
    public void show() {
        System.out.println(Arrays.toString(elements));
    }

    //删除数组中的元素
    public void delete(int index) {
        //判断下标
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界！");
        }
        //删除元素
        //创建一个新的数组 （elements.length - 1）
        Object[] newArr = new Object[elements.length - 1];
        //复制原有数据到新数组
        for (int i = 0; i < newArr.length; i++) {
            //想要删除元素的前面的元素
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                newArr[i] = elements[i + 1];
            }
        }
        //新数组代替旧数组
        elements = newArr;
    }

    //取出指定位置的元素
    public Object get(int index) {
        return elements[index];
    }

    //插入元素到指定位置
    public void insert(int index, Object element) {
        //判断下标
        if (index < 0 || index > elements.length) {
            throw new RuntimeException("下标越界！");
        }
        //插入元素
        //创建一个新的数组 （elements.length + 1）
        Object[] newArr = new Object[elements.length + 1];
        //复制原有数据到新数组
        for (int i = 0; i < elements.length; i++) {
            //想要插入元素的前面的元素
            if (i < index) {
                newArr[i] = elements[i];
                //目标位置之后的元素
            } else {
                newArr[i + 1] = elements[i];
            }
        }
        //插入新元素
        newArr[index] = element;
        //新数组代替旧数组
        elements = newArr;
    }

    //替换指定位置的元素
    public void set(int index, Object element) {
        if (index<0||index>elements.length - 1){
            throw new RuntimeException("下标越界！");
        }
        elements[index] = element;
    }

    //线性查找
    public int search(Object target){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //二分查找
    public int binarySearch(Object target){
        //目标元素下标
        int index = -1;
        //记录开始位置下标(begin)
        int start = 0;
        //记录结束位置下标
        int end = elements.length - 1;
        //记录中间位置
        int middle = (start + end) / 2;
        //循环查找
        while (true) {
            //什么情况下没有这个元素
            //如果开始位置在结束位置之后或者重合,则没有这个元素
            if (start>=end){
                return -1;
            }

            //判断中间位置元素是否为查找元素
            if (elements[middle] == target) {
                return middle;
            }
            //中间位置元素不是要查找元素
            else {
                //如果查找元素小于中间元素
                if ((int)elements[middle] > (int)target) {
                    //将结束位置设置为（middle-1）
                    end = middle - 1;
                }else{
                    //将开始位置设置为（middle+1）
                    start = middle +1;
                }
                //取出新的中间位置
                middle=(end+start)/2;
            }
        }
    }

}

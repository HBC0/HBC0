import datestructure.array.MyArray;

public class TestMyArray {
    public static void main(String[] args) {
        //创建一个可变数组
        MyArray array = new MyArray();
        //获取长度
        int size = array.size();
        System.out.println(size);
        //往数组末尾添加一个元素
        array.add(1);
        array.add(2);
        array.add(3);
        array.show();
        array.insert(0,0);
        array.show();
        array.delete(3);
        array.show();
        array.set(2, 6);
        array.show();
        System.out.println("index:" + array.binarySearch(1));
    }
}

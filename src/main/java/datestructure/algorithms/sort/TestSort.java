package datestructure.algorithms.sort;

import java.util.Arrays;
import java.util.Random;

public class TestSort {
    public static void main(String[] args) {
        int[] array = new int[]{10, 23, 8, 73, 123,99};
//        Random random = new Random();
//        int high = random.nextInt(array.length);
//        System.out.println(high);

        //快速排序
        QuickSort.quickSort(array, 0,array.length - 1);
        System.out.println("排序后的结果");
        System.out.println(Arrays.toString(array));

        //冒泡排序
        BubbleSort.bubbleSort(array);
    }
}

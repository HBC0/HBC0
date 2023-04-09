package datestructure.algorithms.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{10, 23, 8, 73, 123,99};
        bubbleSort(array);
    }

    // 每一次循环得到一个最大（最小的数） 次数为（length-1）
    // 前后两个数比较，大（小）的数后移 次数为（length - 1 - i（i为循环的次数））

    public static void bubbleSort(int[] arr) {
        int val = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            //前后两数比较

            for (int j = 0; j < arr.length -1 - i; j++) {
                //如果前一个数大于后一个则前后互换
                if (arr[j] > arr[j + 1]) {
                    val = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = val;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
    }

}

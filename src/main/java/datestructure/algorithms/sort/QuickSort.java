package datestructure.algorithms.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 快速排序
 */
//public class QuickSort {
//
//    // {10, 23, 8, 73, 123,99}
//
//    public static void quickSort(int[] array,int start,int end){
//        //随机取一个数据为标准数（standard）
//        Random random = new Random();
//        start = random.nextInt(array.length);
//        int standard = array[start];
//        //记录需要排序的下标
//        int low = start;
//        int high = end;
//        //循环比较比标准数大和小的数
//        while (low<high){
//            //右边的数比标准数大
//            while (low <high && standard<= array[high]){
//                high--;
//            }
//
//            //使用
//
//        }
//    }
//
//}


public class QuickSort {

    public static int partition(int[] array, int low, int high) {
        // 取最后一个元素作为中心元素
        int pivot = array[high];
        // 定义指向比中心元素大的指针，首先指向第一个元素
        int pointer = low;
        // 遍历数组中的所有元素，将比中心元素大的放在右边，比中心元素小的放在左边
        for (int i = low; i < high; i++) {
            if (array[i] <= pivot) {
                // 将比中心元素小的元素和指针指向的元素交换位置
                // 如果第一个元素比中心元素小，这里就是自己和自己交换位置，指针和索引都向下一位移动
                // 如果元素比中心元素大，索引向下移动，指针指向这个较大的元素，直到找到比中心元素小的元素，并交换位置，指针向下移动
                int temp = array[i];
                array[i] = array[pointer];
                array[pointer] = temp;
                pointer++;
            }
            System.out.println(Arrays.toString(array));
        }
        // 将中心元素和指针指向的元素交换位置
        int temp = array[pointer ];
        array[pointer] = array[high];
        array[high] = temp;
        return pointer;
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // 获取划分子数组的位置
            int position = partition(array, low, high);
            // 左子数组递归调用
            quickSort(array, low, position -1);
            // 右子数组递归调用
            quickSort(array, position + 1, high);
        }
    }

}
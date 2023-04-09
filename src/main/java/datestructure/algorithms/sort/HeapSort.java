package datestructure.algorithms.sort;

import java.util.Arrays;

/**
 * 堆排序
 * [5][32][52][2][1][0][6][9][2]
 *       5
 *   32      52
 *  2   1   0   6
 * 9 2
 *
 * 大顶堆（升序排序）
 * [52, 32, 6, 9, 1, 0, 5, 2, 2]
 *       52
 *    32      6
 *  9   1   0   5
 * 2 2
 *
 * {5, 32, 52, 2, 1, 0, 6, 9, 2}
 * [52, 32, 6, 9, 1, 0, 5, 2, 2]
 *
 */

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 32, 52, 2, 1, 0, 6, 9, 2};
        // 开始位置是最后一个非叶子节点（对后一个节点的父节点）
        int start = (arr.length-1)/2;
        for (int i = start; i >=0 ; i--) {
            maxHeap(arr,arr.length,i);
        }
        System.out.println(Arrays.toString(arr));

        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr){
        // 开始位置是最后一个非叶子节点（对后一个节点的父节点）
        int start = (arr.length-1)/2;
        // 调整为大顶堆
        for (int i = start; i >=0 ; i--) {
            maxHeap(arr,arr.length,i);
        }

        // 先把数组中的第0个和堆中的最后一个交换位置，
        // 再把前面的元素从新处理为大顶堆
        for (int i = arr.length-1; i >=0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeap(arr,i,0);
        }
    }

    public static void maxHeap(int[] arr, int size, int index) {
        //左子节点
        int leftNode = 2 * index + 1;
        //右子节点
        int rightNode = 2 * index + 2;
        int max = index;

        //和两个子节点对比
        if (leftNode<size && arr[leftNode] > arr[max]) {
            max = leftNode;
        }
        if (rightNode<size && arr[rightNode] > arr[max]) {
            max = rightNode;
        }

        //交换位置
        if (max != index) {
            int temp = arr[index];
            arr[index] = arr[max];
            arr[max] = temp;
            //交换位置之后，可能会破坏之前排好的堆，所以之前排好的堆需要重新调整
            maxHeap(arr,size,max);
        }
    }

}

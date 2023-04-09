package datestructure.algorithms.search;

/**
 * 线性查找
 */
public class TestSearch {
    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{1, 3, 23, 2, 19};
        //目标元素
        int target = 0;
        //目标元素下标
        int index = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == target) {
                index=j;
                break;
            }
        }

        //打印下标
        System.out.println("index:"+ index);
    }
}

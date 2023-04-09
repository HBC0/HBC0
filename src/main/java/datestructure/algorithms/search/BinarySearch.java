package datestructure.algorithms.search;

public class BinarySearch {
    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //目标元素下标
        int index = -1;
        //目标元素
        int target = 10;
        //记录开始位置下标(begin)
        int start = 0;
        //记录结束位置下标
        int end = arr.length - 1;
        //记录中间位置
        int middle = (start + end) / 2;
        //循环查找
        while (true) {
            //判断中间位置元素是否为查找元素
            if (arr[middle] == target) {
                index = middle;
                break;
            }
            //中间位置元素不是要查找元素
            else {
                //如果查找元素小于中间元素
                if (arr[middle] > target) {
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
        System.out.println("index:" + index);
    }
}

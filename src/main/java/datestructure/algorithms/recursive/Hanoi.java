package datestructure.algorithms.recursive;

public class Hanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
    /**
     * @author n  共有n个盘子
     * @author from     开始的位置
     * @author in       中间的位置
     * @author to       目标位置
     * 无论多少盘子都认为只有两个盘子
     */
    public static void hanoi(int n , char from, char in , char to){
        if (n == 1){
            System.out.println("第1个盘子从"+from+"移到"+to);
        }else {
            //移动上面的所有的盘子到中间位置
            hanoi(n-1,from,to,in);
            //移动最下面的盘子到目标位置
            System.out.println("第"+n+"盘子从"+from+"移到"+to);

            //将中间位置的所有盘子移动到目标位置
            hanoi(n-1,in,from,to);
//            System.out.println("第"+n+"盘子从"+from+"移到"+to);
//            System.out.println("第1个盘子从"+in+"移到"+to);
        }
    }
}

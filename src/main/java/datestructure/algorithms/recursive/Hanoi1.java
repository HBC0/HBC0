package datestructure.algorithms.recursive;

public class Hanoi1 {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
    public static void hanoi(int n , char from, char in , char to){
        if (n == 1){
            System.out.println("将第"+n+"个盘中从"+from+"移到"+to);
        }else {
            hanoi(n-1,from,to,in);
            System.out.println("将第"+n+"个盘中从"+from+"移到"+to);
            hanoi(n-1,in,from,to);
        }
    }
}

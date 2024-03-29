package datestructure.algorithms.recursive;

public class Fibonacci {
    public static void main(String[] args) {
        //斐波那契数列：1 1 2 3 5 8 13
        int i = fibonacci(5);
        System.out.println(i);
    }

    public static int fibonacci(int i){
        if (i == 1 || i== 2 ){
            return 1;
        }else {
            return fibonacci(i-1)+fibonacci(i-2);
        }
    }
}

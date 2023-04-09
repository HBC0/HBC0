package datestructure.algorithms.recursive;

public class Recursive {
    public static void main(String[] args) {
        print(10);
    }

    public static void print(int value) {
        if (value >= 0) {
            System.out.println(value);
            print(value - 1);
        }
    }

}

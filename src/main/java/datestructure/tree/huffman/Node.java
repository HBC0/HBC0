package datestructure.tree.huffman;

import org.jetbrains.annotations.NotNull;

public class Node implements Comparable<Node>{

    private Byte data;
    private int value;
    private Node left;
    private Node right;

    public int getValue() {
        return value;
    }

    public Byte getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(Byte data, int value) {
        this.data = data;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(@NotNull Node o) {
        return -(o.value-this.value);
    }
}

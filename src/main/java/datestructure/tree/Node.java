package datestructure.tree;

import org.jetbrains.annotations.NotNull;

public class Node implements Comparable<Node>{

    int value;
    Node left;
    Node right;

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public int compareTo(@NotNull Node o) {
        return -(this.value-o.value);
    }

}

package datestructure.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *     Huffman tree
 * 3, 7, 8, 29, 5, 11, 23, 14
 *
 *  Create Huffman Tree
 * Tree 29 23 14 11 8 7 5 3
 *   8
 * 3   5
 *
 * 29 23 14 11 8 7
 * 29 23 14 11 8 7 8(3 5)
 *
 * 29 23 14 11 8 8(3 5) 7
 *      15
 *    7    8
 *       3   5
 *
 * 29 23 14 11 8
 * 29 23 14 11 8 15(7 8 3 5)
 *       .
 *       .
 *       .
 */

public class HuffmanTree {

    public static void main(String[] args) {

        int[] arr = {3, 7, 8, 29, 5, 11, 23, 14};
        Node node = createHuffmanTree(arr);
        System.out.println(node.getValue());
        System.out.println(node.getLeft().getLeft().getLeft());
    }

//    Node node = createHuffmanTree(arr);

    // 创建哈夫曼树
    public static Node createHuffmanTree(int[] arr) {

        //先使用数组中的所有元素创建若干个二叉树  （只有一个节点）
        List<Node> nodes = new ArrayList<>();
        for (int value : arr) {
            nodes.add(new Node(value));
        }
        Collections.sort(nodes);
        System.out.println(nodes);

        // 循环处理
        while (nodes.size() > 1){
            // 排序
            Collections.sort(nodes);

            // 取出权值最小的两个二叉树
            // min -> left
            Node left = nodes.get(nodes.size()- 1);
            // max -> right
            Node right = nodes.get(nodes.size()- 2);

            // 创建一颗新的二叉树
            Node parent = new Node(left.value + right.value);
            parent.setLeft(left);
            parent.setRight(right);

            // 把取出来的两棵二叉树移除
            nodes.remove(left);
            nodes.remove(right);

            // 放入到原来的二叉树集合中
            nodes.add(parent);

        }
        System.out.println(nodes);

        return nodes.get(0);
    }

}

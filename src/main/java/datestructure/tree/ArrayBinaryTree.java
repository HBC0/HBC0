package datestructure.tree;

/**
 * 顺序存储的二叉树通常只考虑完全二叉树
 * 第 n个元素的左子节点为：2*n+1
 * 第 n个元素的右子节点为：2*（n+1）
 * 第 n个元素的父节点为：（n-1）/2
 * 顺序存储的二叉树
 *
 *      1[0]
 *    2   3
 * 4   5 6   7
 *
 * [1][2][3][4][5][6][7]
 */

public class ArrayBinaryTree {
    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    public void frontShow() {
        frontShow(0);
    }

    //前序遍历
    public void frontShow(int index) {
        if (data == null || data.length == 0) {
            return;
        }
        //先遍历当前节点的内容
        System.out.print(data[index]);
        //左节点(2*index+1)
        if (2 * index + 1 < data.length) {
            frontShow(2 * index + 1);
        }
        //右节点(2*index+2)
        if (2 * index + 2 < data.length) {
            frontShow(2 * index + 2);
        }
    }

}

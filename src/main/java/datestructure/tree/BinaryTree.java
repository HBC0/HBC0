package datestructure.tree;

/**
 *       链式存储的二叉树
 *
 *          满二叉树
 *          [][][]
 *         /      \
 *     [][][]     [][][]
 *     /   \     /     \
 *[][][] [][][] [][][] [][][]
 *  二叉树：任何一个节点的子节点数量不超过2
 *  二叉树的子节点分为左节点和右节点
 *  满二叉树：所有叶子节点都在最后一层，且节点总数为：2^n-1（n为树的高度）
 *  完全二叉树：所有节点都在最后一层或倒数第二层，且最后一层的叶子节点在左边连续，
 *  倒数第二节的叶子节点在右边连续
 *              完全二叉树
 *          [][][]
 *         /      \
 *     [][][]     [][][]
 *     /   \
 * [][][] [][][]
 */

public class BinaryTree {

    //根节点
    TreeNode root;

    // 设置根节点
    public void setRoot(TreeNode root){
        this.root = root;
    }

    // 获取根节点
    public TreeNode getRoot() {
        return root;
    }


    public void frontShow() {
        root.frontShow();
    }

    public void middleShow(){
        if (root!= null) {
            root.middleShow();
        }else {
            throw new RuntimeException("此树为空！");
        }
    }

    public void afterShow(){
        root.afterShow();
    }

    public TreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }

    public void deleteTree(int i) {
        if (root.value == i ){
            root = null;
        }else {
            root.deleteTree(i);
        }
    }
}

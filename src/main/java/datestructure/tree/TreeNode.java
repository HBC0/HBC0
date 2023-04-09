package datestructure.tree;

/**
 * 二叉树节点
 * -----------------------------
 * |liftNode|  value  |rightNode|
 * -----------------------------
 */

public class TreeNode {
    // 节点的权
    int value;
    //左儿子
    TreeNode leftNode;
    //右儿子
    TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    //设置左儿子
    public void setLeftNode(TreeNode lNode) {
        this.leftNode = lNode;
    }

    //设置右儿子
    public void setRightNode(TreeNode rNode) {
        this.rightNode = rNode;
    }

    /**
     *                   遍历二叉树
     *                      1              前序遍历；    1     2 4 5   3 6 7
     *                   2      3          中序遍历；  4 2 5     1     6 3 7
     *                 4   5  6   7        后序遍历；  4 5 2   6 7 3     1
     */

    //前序遍历
    public void frontShow() {
        //先遍历当前节点的内容
        System.out.print(value + " ");
        //左节点
        if (leftNode != null) {
            leftNode.frontShow();
        }
        //右节点
        if (rightNode != null) {
            rightNode.frontShow();
        }
    }

    //中序遍历
    public void middleShow() {
        //左节点
        if (leftNode != null) {
            leftNode.middleShow();
        }
        //当前内容
        System.out.print(value + " ");
        //右节点
        if (rightNode != null) {
            rightNode.middleShow();
        }
    }

    //后序遍历
    public void afterShow() {
        //左节点
        if (leftNode != null) {
            leftNode.afterShow();
        }
        //右节点
        if (rightNode != null) {
            rightNode.afterShow();
        }
        //当前内容
        System.out.print(value + " ");
    }

    //前序查找
    public TreeNode frontSearch(int i) {
        TreeNode target = null;
        //对比当前节点的值
        if (this.value == i) {
            return this;
            //当前节点的值不是要查找的节点
        } else {
            //查找左儿子
            if (leftNode != null) {

                target = leftNode.frontSearch(i);
            }
            //如果不为空，说明左儿子中已经找到
            if (target != null){
                return target;
            }
            //查找右儿子
            if (rightNode != null) {
                target = rightNode.frontSearch(i);
            }
        }
        return target;
    }

    //删除一个子树
    public void deleteTree(int i) {
        TreeNode parent = this;
        //判断左
        if (parent.leftNode !=null && parent.leftNode.value == i){
            parent.leftNode = null;
            return;
        }
        //判断右
        if (parent.rightNode !=null && parent.rightNode.value == i){
            parent.rightNode =null;
            return;
        }
        //递归检查，删除左儿子
        parent = leftNode;
        if (parent !=null){
            parent.deleteTree(i);
        }
        //递归检查，删除右儿子
        parent = rightNode;
        if (parent != null){
            parent.deleteTree(i);
        }
    }
}

package datestructure.tree;

/**
 * 创建
 * 添加
 * 遍历
 * 查找
 * 删除
 */

public class TestBinaryTree {
    public static void main(String[] args) {
        //创建一棵树
        BinaryTree binaryTree = new BinaryTree();
        //创建一个根节点
        TreeNode root = new TreeNode(1);
        // 把根节点赋给树
        binaryTree.setRoot(root);
        //创建两个节点
        TreeNode rootRight = new TreeNode(3);
        TreeNode rootLeft = new TreeNode(2);
        //把新创建的节点设置为根节点的子节点
        root.setLeftNode(rootLeft);
        root.setRightNode(rootRight);

        //为第二层的左节点创建两个子节点
        rootLeft.setLeftNode(new TreeNode(4));
        TreeNode node5 = new TreeNode(5);
        rootLeft.setRightNode(node5);
        //为第二层的右节点创建两个子节点
        rootRight.setLeftNode(new TreeNode(6));
        rootRight.setRightNode(new TreeNode(7));

        /**
         *                   遍历二叉树
         *                      1              前序遍历；    1     2 4 5   3 6 7
         *                   2      3          中序遍历；  4 2 5     1     6 3 7
         *                 4   5  6   7        后序遍历；  4 5 2   6 7 3     1
         */

        //前序遍历
        System.out.println("前序遍历：");
        binaryTree.frontShow();
        System.out.println();

        //中序遍历
        System.out.println("中序遍历：");
        binaryTree.middleShow();
        System.out.println();

        //后序遍历
        System.out.println("后序遍历：");
        binaryTree.afterShow();

        //前序查找
        TreeNode result = binaryTree.frontSearch(8);
        System.out.println(result);
        System.out.println(result==node5);

        // 删除节点
        int i = 1;
        System.out.println("删除"+i+ "后：");
        binaryTree.deleteTree(i);
        binaryTree.middleShow();
        System.out.println();
    }
}

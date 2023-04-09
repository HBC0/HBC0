package datestructure.tree.huffman;

import java.util.*;

public class TestHuffmanCode {
    public static void main(String[] args) {
        String message = "can can need.";
        byte[] bytes = message.getBytes();

        // 进行Huffman编码
        byte[] b = huffmanZip(bytes);
    }

    /**
     * 进行huffman编码压缩的方法
     */
    private static byte[] huffmanZip(byte[] bytes) {
        //统计每一个byte出现的次数，并且放入一个集合中
        List<Node> nodes = getNodes(bytes);
        //创建一颗 Huffman树
        Node tree = createHuffmanTree(nodes);
        System.out.println(tree.getLeft().getValue());
        System.out.println(tree.getRight().getValue());
        //创建一个哈夫曼编码表
        
        //编码
        return null;
    }

    /**
     * 创建Huffman树
     * @param nodes
     * @return
     */
    private static Node createHuffmanTree(List<Node> nodes) {
        while(nodes.size()>1){
            // 排序
            Collections.sort(nodes);

            // 取出权值最小的两个二叉树
            // min -> left
            Node left = nodes.get(nodes.size()- 1);
            // max -> right
            Node right = nodes.get(nodes.size()- 2);

            // 创建一颗新的二叉树
            Node parent = new Node(null,left.getValue() + right.getValue());
            parent.setLeft(left);
            parent.setRight(right);

            // 把取出来的两棵二叉树移除
            nodes.remove(left);
            nodes.remove(right);

            // 放入到原来的二叉树集合中
            nodes.add(parent);

        }
        return nodes.get(0);
    }

    /**
     * byte数组转换为 Node集合
     */
    private static List<Node> getNodes(byte[] bytes) {
        List<Node> nodes = new ArrayList<>();
        // 存储每一个byte出现的次数
        HashMap<Byte, Integer> counts = new HashMap<>();
        // 统计每一个byte出现的次数
        for (byte b:bytes){
            //System.out.println(b);
            Integer count = counts.get(b);
            if (count == null){
                counts.put(b,1);
            }else {
                counts.put(b,count+1);
            }
        }

        // 把每一个键值对转为node对象
        for (Map.Entry<Byte, Integer> map:counts.entrySet()){
            nodes.add(new Node(map.getKey(),map.getValue()));
        }
//        byte a = 99;
//        System.out.println(counts.get(a));
        return nodes;
    }
}

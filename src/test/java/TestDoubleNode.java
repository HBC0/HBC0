import datestructure.list.DoubleNode;

public class TestDoubleNode {
    public static void main(String[] args) {
        DoubleNode d1 = new DoubleNode(1);
        DoubleNode d2 = new DoubleNode(2);
        DoubleNode d3 = new DoubleNode(3);

        //n2节点的上一个、下一个节点（n2）
        System.out.println(d2.pre().getValue());
        System.out.println(d2.next().getValue());
        System.out.println(d2.pre().pre().pre().getValue());

        //追加节点
        d1.after(d2);
        d2.after(d3);

        System.out.println(d2.pre().getValue());
        System.out.println(d2.next().getValue());
        System.out.println(d2.pre().pre().pre().getValue());

    }

}

import datestructure.list.Node;

public class TestNode {
    public static void main(String[] args) {
        //创建节点
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        //追加节点
        n1.oppend(n2);
        n1.oppend(n3);

        //取出下一个节点数据
        System.out.println(n1.next().next().getData());

        System.out.println(n1.next().next().isLast());

//        //显示所有节点
//        n1.show();
//        //删除一个节点
//        n1.next().removeNext();
        n1.show();

        //插入一个新节点
        n2.after(new Node(4));
        n1.show();
        System.out.println(n2.next().getData());
    }
}

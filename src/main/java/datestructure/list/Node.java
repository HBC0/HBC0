package datestructure.list;

//一个节点
public class Node {
    //节点内容
    int data;
    //下一个节点
    Node next;

    public Node(int data) {
        this.data = data;
    }

    //获取下一个节点
    public Node next() {
        return this.next;
    }

    //为节点追加节点
    public Node oppend(Node node) {
        //当前节点
        Node currentNode = this;
        //循环向后找
        while (true) {
            //取出下一个节点
            Node nextNode = currentNode.next;
            //如果下一个节点为Null，当前节点已经是最后一个节点
            if (nextNode == null) {
                break;
            }
            //赋给当前节点
            currentNode = nextNode;
        }
        //把需要追回的节点追加到找到的当前节点的下一个节点
        currentNode.next = node;

        return this;
    }

    //显示所有节点信息
    public void show() {
        Node carrentNode = this;
        while (true) {
            System.out.print(carrentNode.data + " ");
            //取出下一个节点
            carrentNode = carrentNode.next;
            //如果是最后一个节点
            if (carrentNode == null) {
                break;
            }
        }
        System.out.println();
    }

    //获取节点数据
    public int getData() {
        return this.data;
    }

    //当前节点是否是最后一个节点
    public boolean isLast() {
        return this.next == null;
    }

    //插入一个节点结点，作为当前节点的下一个节点
    public void after(Node node){
        //取出下一个节点作为下下个节点
        Node newNode = this.next;
        //新节点为当前节点的下一个节点
        this.next=node;
        //新节点的下一个节点为newNode
        node.next=newNode;
    }

    //删除下一个节点
    public void removeNext() {
        //取出下下一个节点
        Node newNext = this.next.next;
        //下下个节点设置为当前节点的下一个节点
        this.next = newNext;
    }
}

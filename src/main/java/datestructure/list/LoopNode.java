package datestructure.list;

//一个节点
public class LoopNode {
    //节点内容
    int data;
    //下一个节点
    LoopNode next = this;

    public LoopNode(int data) {
        this.data = data;
    }

    //获取下一个节点
    public LoopNode next() {
        return this.next;
    }

    //获取节点数据
    public int getData() {
        return this.data;
    }

    //插入一个节点结点，作为当前节点的下一个节点
    public void after(LoopNode node){
        //取出下一个节点作为下下个节点
        LoopNode newNode = this.next;
        //新节点为当前节点的下一个节点
        this.next=node;
        //新节点的下一个节点为newNode
        node.next=newNode;
    }

    //删除下一个节点
    public void removeNode() {
        //取出下下一个节点
        LoopNode newNext = this.next.next;
        //下下个节点设置为当前节点的下一个节点
        this.next = newNext;
    }
}

package datestructure.list;

import java.util.function.DoublePredicate;

public class DoubleNode {
    //上一个节点 (previous)
    DoubleNode pre = this;
    //下一个节点
    DoubleNode next = this;
    //节点内容
    int value;

    public DoubleNode(int value) {
        this.value = value;
    }

    //增加节点
    public void after(DoubleNode node){
        //取出当前节点的下一个节点
        DoubleNode newNode = this.next;
        //当前节点指向新节点
        this.next = node ;
        //将新节点指向当前节点
        node.pre = this;
        //新节点指向newNode
        node.next = newNode;
        //当前节点的下一个节点指向新节点
        newNode.pre = node;
    }

    //获取下一个节点
    public DoubleNode next(){
        return this.next;
    }

    //获取上一个节点
    public DoubleNode pre(){
        return this.pre;
    }

    //获取数据
    public int getValue(){
        return this.value;
    }

}

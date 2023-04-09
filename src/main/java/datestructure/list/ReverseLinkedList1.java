package datestructure.list;

public class ReverseLinkedList1 {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode tail = new ListNode(5);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=tail;

        System.out.println(head.next);
        System.out.println(node1.next);
        System.out.println(node2.next);
        System.out.println(node3.next);
        System.out.println(tail);

        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }

        ListNode head2 = head;
        while (head2 != null){
            System.out.print(head2.val);
            head2 = head2.next;
            if (head2 != null){
                System.out.print("->");
            }
        }
        System.out.println();
        head2 = reverseLinkedList(head);
        while (head2 != null){
            System.out.print(head2.val);
            head2 = head2.next;
            if (head2 != null){
                System.out.print("->");
            }
        }
        System.out.println();
        head2 = reverseLinkedList(null);
        while (head2 != null){
            System.out.print(head2.val);
            head2 = head2.next;
            if (head2 != null){
                System.out.print("->");
            }
        }
    }

    public static ListNode reverseLinkedList(ListNode head){

        if (head == null){
            return head;
        }
        // 1-> 2 -> 3-> 4 -> 5
        // previous(以前) -> current(现在)
        // head == 1
        ListNode previous = head;
        ListNode current = head.next;
        // 1 2 -> 3-> 4 -> 5
        previous.next = null;
        while (current != null){
            // 1 2 -> 3-> 4 -> 5
            // prev current -> next
            ListNode next = current.next;
            // 1 <-2  3-> 4 -> 5
            // current -> prev
            current.next=previous;
            previous=current;
            current=next;
        }
        return  previous;
    }
}

/**
 * @author yufeng1900
 * @create 2021-04-17 21:21
 */
public class JavaTest1 {
    public static void main(String[] args) {
        //测试

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);
        ListNode n8 = new ListNode(8);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        System.out.println(returnList(n1));

    }

    public static ListNode returnList(ListNode head){
        ListNode end = new ListNode();
        ListNode tmp1;
        ListNode tmp2;
        end.next = head;
        while(head.next != null){
            tmp1 = end.next;
            tmp2 = head.next;

            end.next = head.next.next;
            head.next = end.next;

            tmp2.next = tmp1;
            end.next = tmp2;
        }
        end = end.next;
        return end;
    }
}

class ListNode {
    int val;  //链表中节点的值
    ListNode next;  //引用

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }
    public String toString(){
        if(next==null) return val + "-->null";
        else return val + "-->" + next.toString();
    }
}
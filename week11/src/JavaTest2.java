/**
 * @author yufeng1900
 * @create 2021-04-17 22:04
 */
public class JavaTest2 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(8);
        ListNode n5 = new ListNode(0);
        ListNode n6 = new ListNode(4);
        ListNode n7 = new ListNode(5);
        ListNode n8 = new ListNode(7);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        System.out.println(emerge(n1,n5));
    }
    public static ListNode emerge(ListNode a, ListNode b){
        ListNode aa = new ListNode();
        ListNode ab = new ListNode();

        ListNode head = new ListNode();

        head.next = a;
        aa.next = a;
        ab.next = aa.next.next;

        ListNode tmp = new ListNode();
        while(ab != null && b != null){
            if(aa.next == a && b.val <= ab.val){
                tmp = b;

                b = b.next;
                aa.next = tmp;
                tmp.next = ab;
                aa = aa.next;
                tmp.next = head.next;
                head.next = tmp;
            }else if(ab.val>=b.val && b.val>=aa.val){
                tmp = b;
                b = b.next;
                aa.next = tmp;
                tmp.next = ab;
                aa = aa.next;
            }else if(b.val > ab.val){
                aa = aa.next;
                ab = ab.next;
            }
        }
        return head.next;
    }
}
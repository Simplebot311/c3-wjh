/**
 * @author yufeng1900
 * @create 2021-04-17 22:12
 */
public class JavaTest3 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(3);
        ListNode n7 = new ListNode(2);
        ListNode n8 = new ListNode(1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        System.out.println(isHuiwenList(n1));
    }

    public static boolean isHuiwenList(ListNode head){
        String str1 = head.toString();
        String str2 = returnList(head).toString();
        return str1.equals(str2);
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
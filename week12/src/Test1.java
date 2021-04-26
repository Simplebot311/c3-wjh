/**
 * @author yufeng1900
 * @create 2021-04-26 8:26
 */
public class Test1 {
    public static void main(String[] args) {
        ListNode a3 = new ListNode(7);
        ListNode a2 = new ListNode(5,a3);
        ListNode a1 = new ListNode(1,a2);

        ListNode b3 = new ListNode(6);
        ListNode b2 = new ListNode(3,b3);
        ListNode b1 = new ListNode(2,b2);
        System.out.println(mergeTwoLists(a1,b1));
    }

    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode go = new ListNode();
        ListNode head = go;
        while(l1 != null || l2 != null){
            if(l1 == null){
                go.next = l2;
                return head.next;
            }
            if(l2 == null){
                go.next = l1;
                return head.next;
            }
            if(l1.val > l2.val){
                go.next = new ListNode(l2.val);
                l2 = l2.next;
                go = go.next;
            }else {
                go.next = new ListNode(l1.val);
                l1 = l1.next;
                go = go.next;
            }
        }
        return head.next;
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    @Override
    public String toString(){
        if(next == null)
            return val+"-->null";
        return val+"-->"+next;
    }
}
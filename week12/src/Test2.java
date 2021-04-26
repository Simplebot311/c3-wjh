import java.util.HashSet;
import java.util.Set;

/**
 * @author yufeng1900
 * @create 2021-04-26 8:56
 */
public class Test2 {
    public static void main(String[] args) {
        ListNode a3 = new ListNode(7);
        ListNode a2 = new ListNode(5,a3);
        ListNode a1 = new ListNode(1,a2);
        ListNode a0 = new ListNode(5,a1);
        System.out.println(deleteDuplicates(a0));

    }
    public static ListNode deleteDuplicates(ListNode head){
        Set<Integer> check = new HashSet<>();
        ListNode ans = new ListNode();
        ListNode go = ans;

        while(head != null){
            if(check.add(head.val)){
                go.next = head;
                head = head.next;
                go = go.next;
            }else{
                head = head.next;
            }
        }
        go.next = null;
        return ans.next;
    }
}

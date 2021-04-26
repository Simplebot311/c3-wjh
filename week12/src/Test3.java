import java.util.HashSet;
import java.util.Set;

/**
 * @author yufeng1900
 * @create 2021-04-26 9:12
 */
public class Test3 {
    public static void main(String[] args) {
        ListNode a3 = new ListNode(7);
        ListNode a2 = new ListNode(5,a3);
        ListNode a1 = new ListNode(1,a2);
        ListNode a0 = new ListNode(5,a1);
        a3.next = a2;
        System.out.println(hasCycle(a0));

    }

    public static boolean hasCycle(ListNode head){
        Set<ListNode> check = new HashSet<>();
        while(head!=null){
            if(!check.add(head))return true;
        }
        return false;
    }
}

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author yufeng1900
 * @create 2021-02-18 15:02
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Set set = new HashSet();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }

        str = set.toString();

        for (int i = 0; i < set.size(); i++) {
            System.out.print(str.charAt(i*3+1));
        }
    }
}

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author yufeng1900
 * @create 2021-02-18 15:22
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] chars = str.toCharArray();

        HashMap<String,String> map = new HashMap<>();
        int count;
        for (int i = 0; i < chars.length; i++) {
            if(map.containsKey(""+chars[i])){
                count = Integer.valueOf(map.get(""+chars[i]));
                count++;
                map.put(""+chars[i],""+count);
            }else{
                map.put(""+chars[i],"1");
            }
        }
        System.out.println(map);
    }
}

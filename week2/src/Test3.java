import java.util.Scanner;

/**
 * @author yufeng1900
 * @create 2021-02-06 13:49
 */
public class Test3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //读入，输入示例：
        //strs = "aslkjd23sakld234sdah23rawa34"
        String mat = scanner.nextLine();
        //提取数据
        mat = mat.replaceAll("strs","");
        mat = mat.replaceAll("[= \"]","");
        mat = mat.replaceAll("[a-zA-Z]",",");
        char[] chars = mat.toCharArray();

        System.out.println(mat);

        //判断最短字符串
        boolean isNum = false,isnum = false;
        System.out.print("[");
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ',') {
                if(isNum&&isnum) System.out.print(",");
                isNum = true;
                isnum = false;
                System.out.print("" + chars[i]);
            }else{
                isnum = true;
            }

        }

        System.out.println("]");
    }
}

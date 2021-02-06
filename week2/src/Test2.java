import java.util.Scanner;

/**
 * @author yufeng1900
 * @create 2021-02-05 9:41
 */
public class Test2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //读入，输入示例：
        //strs = ["flower","flow","flight"]
        String mat = scanner.nextLine();
        //提取数据
        mat = mat.replaceAll("strs","");
        mat = mat.replaceAll("[\\[\\]= \"]","");
        String[] mats = mat.split(",");
        //System.out.println(mat);
        //判断最短字符串
        int n = 0;
        for (int i = 0; i < mats.length; i++) {
            if (n < mats[i].length()) n = mats[i].length();
                //n = (n < mats[i].length())?(mats[i].length()):n;
        }

        char[] chars = new char[n];//设置一个字符数组存储公共字符
        //获取公共前缀
        TOP:
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < mats.length; j++) {
                if (mats[j].charAt(i)==mats[j-1].charAt(i)) continue;
                break TOP;
            }
            chars[i] = mats[0].charAt(i);
        }
        //转化为字符串输出
        String ans = new String(chars);
        System.out.println(ans);

    }
}

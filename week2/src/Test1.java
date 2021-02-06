import java.util.Scanner;

/**
 * @author yufeng1900
 * @create 2021-02-05 8:03
 */
public class Test1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //读入，输入示例：
        //matrix = [[1,2,3],[3,4,5],[5,6,7]]
        String mat = scanner.nextLine();
        //提取数据
        mat = mat.replaceAll("[a-zA-Z =\\[\\]]","");
        String[] mats = mat.split(",");
        //System.out.println(mat);
        //判断边长
        int n;
        for (n = 2; n < 100; n++) {
            if(n*n==mats.length)break;
        }
        //按照要求翻转
        String[][] mats0 = new String[n][n];
        int k = 0;
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                mats0[j][i] = mats[k++];
            }
        }

        //以下为打印结果
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                System.out.print(mats0[i][j]);
                if(j!=n-1) System.out.print(",");
            }
            System.out.print("]");
        }
        System.out.println("]");
    }
}

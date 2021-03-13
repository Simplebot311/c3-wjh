import java.util.Scanner;

/**
 * @author yufeng1900
 * @create 2021-03-13 11:14
 */
public class JavaTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int n2 = n/2;

        int count = 0;
        int cm = 1,cn = 1;
        for (int i = n-n/2-n/2,j=n/2; i <= n; i+=2,j--) {
            cm = 1;cn = 1;
            for (int k = 0; k < j; k++) {
                cm *= i+k+1;
                cn *= j-k;
            }
            count += cm/cn;
        }

        System.out.println(count);
    }
}

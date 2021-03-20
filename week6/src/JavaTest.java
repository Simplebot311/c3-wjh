import java.util.Scanner;

/**
 * @author yufeng1900
 * @create 2021-03-20 14:50
 */
public class JavaTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //读入，输入示例：
        //matrix = [[1,2,3],[3,4,5],[5,6,7]]
        String mat = scan.nextLine();
        //提取数据
        mat = mat.replaceAll("[a-zA-Z =]","");
        mat = mat.replace("[[","");
        mat = mat.replace("]]","");
        String[] mats = mat.split("],\\[");
        String[] matss = mats[0].split(",");

        int m = mats.length;//行
        int n = matss.length;//列

        int[][] nums = new int[m][n];

        for (int i = 0; i < m; i++) {
            matss = mats[i].split(",");
            for (int j = 0; j < n; j++) {
                nums[i][j] = Integer.parseInt(matss[j]);
            }
        }

        int mnow = 0;
        int nnow = 0;
        int mmax = m;
        int mmin = 1;
        int nmax = n;
        int nmin = 0;
        boolean isAdd = true;
        for (int count = 0; count < m*n;) {
            if(isAdd && nnow < nmax && mnow < mmax){
                for (; nnow < nmax; nnow++,count++) {
                    System.out.println(nums[mnow][nnow]);
                }
                nnow--;
                mnow++;
                for (; mnow < mmax; mnow++,count++) {
                    System.out.println(nums[mnow][nnow]);
                }
                mnow--;
                nnow--;

                nmax--;
                mmax--;

                isAdd = false;
            }else if(nnow >= nmin && mnow >= mmin){
                for(; nnow >= nmin; nnow--,count++) {
                    System.out.println(nums[mnow][nnow]);
                }
                nnow++;
                mnow--;
                for (; mnow >= mmin; mnow--,count++) {
                    System.out.println(nums[mnow][nnow]);
                }
                mnow++;
                nnow++;

                nmin++;
                mmin++;

                isAdd = true;
            }
        }


    }
}

import java.util.Scanner;

/**
 * @author yufeng1900
 * @create 2021-03-13 11:50
 */
public class JavaTest3 {
    static String[] sons = new String[100];
    static int sonsId = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mat = scanner.nextLine();
        //提取数据
        mat = mat.replaceAll("[a-zA-Z =\\[\\]]","");
        String[] mats = mat.split(",");

        showArrays(mats);

        getSon(mats);



    }
    static void showArrays(String[] nums){//打印数值
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i!=nums.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    static void getSon(String[] mats){
        if(mats.length>0){
            String[] son = new String[mats.length-1];
            for (int i = 0; i < mats.length; i++) {
                for (int j = 0; j < mats.length; j++) {
                    if(i>j){
                        son[j] = mats[j];
                    }else if(i<j){
                        son[j-1] = mats[j];
                    }
                }

                if (isExist(son)){
                    showArrays(son);
                    getSon(son);
                }
            }
        }
    }

    static boolean isExist(String[] mats){
        String son = "";
        for (int i = 0; i < mats.length; i++) {
            son = son + mats[0];
        }

        for (int i = 0; i < sonsId; i++) {
            if(sons[i].equals(son)){
                return false;
            }
        }
        sons[sonsId++] = son;
        return true;
    }
}

import java.util.Scanner;

/**
 * @author yufeng1900
 * @create 2021-02-18 13:47
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请依次输入数组元素，以逗号间隔");
        String str = scan.nextLine();
        String[] st = str.split(",");

        int[] nums = new int[st.length];

        for (int i = 0; i < st.length; i++) {
            nums[i] = Integer.valueOf(st[i]);
        }
//
        for (int i = 0; i < st.length; i++) {
            System.out.println(nums[i]);
        }
  //
        System.out.println("请输入target");
        int target = scan.nextInt();

        System.out.print("[");
        int[] maxs = new int[10];
        int[] mins = new int[10];
        if(st.length>=3){
            int count = 0;
            for (int i = 0; i < st.length-2; i++) {
                for (int j = i+1; j < st.length-1; j++) {
                    NEXT:
                    for (int k = j+1; k < st.length; k++) {
                        if(nums[i]+nums[j]+nums[k] == target){
                            int max = (nums[i]>=nums[j])?nums[i]:nums[j];
                            max = (max>=nums[k])?max:nums[k];
                            for (int l = 0; l < count; l++) {
                                if(maxs[l] == max) continue NEXT;
                            }

                            int min = (nums[i]<=nums[j])?nums[i]:nums[j];
                            max = (min<=nums[k])?min:nums[k];
                            for (int l = 0; l < count; l++) {
                                if(mins[l] == min) continue NEXT;
                            }
                            maxs[count] = max;
                            mins[count++] = min;
                            System.out.print("[" + nums[i] + "," + nums[j] + "," + nums[k] + "," +"]");
                        }
                    }
                }
            }
        }
        System.out.print("]");


    }
}

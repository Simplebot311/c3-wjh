import org.junit.Test;

import java.util.Scanner;

/**
 * @author yufeng1900
 * @create 2021-01-23 13:14
 */
public class view {

    Scanner in=new Scanner(System.in); //创建 Scanner 对象
    public static void main(String[] args) {
        view vision = new view();
        vision.work7();

    }

    @Test
    public void work1(){
        System.out.println("请分别输入体重(kg)和身高(m):");
        double weight = in.nextDouble();
        double height = in.nextDouble();
        People_1 people = new People_1(weight,height);
        System.out.println("BMI = " + (int)(people.getBMI()*100)/100.0);
    }

    @Test
    public void work2(){
        int one;
        int ten;
        int hund;
        System.out.println("满足条件的水仙花数有：");
        for (int i = 100; i < 1000; i++) {
            one = i%10;
            ten = (i%100)/10;
            hund = i/100;
            if(one*one*one + ten*ten*ten + hund*hund*hund == i){
                System.out.println(i);
            }
        }
    }

    @Test
    public void work3(){
        System.out.println("请输入需要反转的字符串：");
        String str = in.next();
        char[] chars = new char[str.length()];
        for (int i = chars.length-1;i >=0;i--){
            chars[i] = str.charAt(chars.length-1-i);
        }
        str = new String(chars);
        System.out.println("反转之后的字符串为："+str);
    }

    @Test
    public void work4(){
        System.out.println("请输入数组长度n：");
        int n = in.nextInt();
        int[] nums = new int[n];

        System.out.println("请依次输入数组元素：");
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        mySort(nums);
        System.out.println("排序后的数组为：");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + nums[i]);

        }
    }

    public int[] mySort(int[] nums){
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > 0; j--) {
                if(nums[j-1]>nums[j]){
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }

    @Test
    public void work5(){
        System.out.println("请输入圆的半径：");
        double redius = in.nextDouble();
        Circle_5 circle = new Circle_5(redius);
        System.out.println("圆的面积为：" + circle.getArea());
        System.out.println("圆的周长为：" + circle.getPerimeter());
    }

    @Test
    public void work6(){
        System.out.println("请输入姓名和余额：");
        String name = in.next();
        int balance = in.nextInt();
        Account_6 account = new Account_6(name,balance);
        System.out.println("账户余额为：" + account.getBalance());
    }

    @Test
    public void work7(){
        System.out.println("请输入两个复数：");
        int real = in.nextInt();
        int virtual = in.nextInt();
        Plural_7 a = new Plural_7(real,virtual);
        real = in.nextInt();
        virtual = in.nextInt();
        Plural_7 b = new Plural_7(real,virtual);

        System.out.println("两复数相加的结果为：" + a.plus(b));
        System.out.println("两复数相加的结果为：" + a.minus(b));
        System.out.println("两复数相加的结果为：" + a.ride(b));
    }

    @Test
    public void work8(){
        Rabbit_8 rabbit = new Rabbit_8();
        Tiger_8 tiger = new Tiger_8();

        rabbit.eat();
        rabbit.sleep();

        tiger.eat();
        tiger.sleep();
    }
}

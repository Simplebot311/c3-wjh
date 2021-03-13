import java.util.Scanner;

/**
 * @author yufeng1900
 * @create 2021-03-13 11:00
 */
public class JavaTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("x = ");
        long x = scan.nextLong();
        long y = 0;

        while(x!=0){
            y = y*10 + x%10;
            x/=10;
        }

        if(y>Math.pow(2,31)-1 || y<-Math.pow(2,31)){
            System.out.println(0);
        }else{
            System.out.println("y=" + y);

        }

    }
}

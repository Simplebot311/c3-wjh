import java.util.Scanner;

/**
 * @author yufeng1900
 * @create 2021-02-08 11:49
 */
public class Test4 {
    public static void main(String[] args) {
        Game game = new Game();
        game.gameStart();
    }
}

class Game{
    int v = 100;

     private int guess(int n){
        if(n<v){
            System.out.println("猜的有点小，再试一下吧！");
            return -1;
        }else if(n>v){
            System.out.println("猜大了噢，再试一下吧！");
            return 1;
        }else{
            System.out.println("恭喜你，猜对了！");
            return 0;
        }
    }

    public void gameStart(){
        Scanner scan = new Scanner(System.in);
        System.out.println("欢迎来到猜字游戏，请输入一个数：");
        while(true){
            int n = scan.nextInt();
            if(guess(n)==0) break;
        }
    }
}

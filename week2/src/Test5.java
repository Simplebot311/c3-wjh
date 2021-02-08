/**
 * @author yufeng1900
 * @create 2021-02-08 12:11
 */
public class Test5 {
    public static void main(String[] args) {
        Monkey monkey = new Monkey(" ");
        People people = new People();

        monkey.speak();

        people.speak();
        people.think();
    }
}

class Monkey{

    public Monkey(String s){

    }

    public void speak(){
        System.out.println("咿咿呀呀......");
    }
}

class People extends Monkey{

    @Override
    public void speak(){
        System.out.println("小样的，不错嘛！会说话了!");
    }

    public void think(){
        System.out.println("别说话！认真思考！");
    }
}
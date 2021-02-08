/**
 * @author yufeng1900
 * @create 2021-02-08 13:14
 */
public class Test8 {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}

abstract class A{
    int numa = 10;

    abstract void showA();
}

abstract class B extends A{
    int numb = 20;

    abstract void showB();
}

class C extends B{
    int numc = 30;

    @Override
    void showA(){
        System.out.println("A类中numa:"+numa);
    }

    @Override
    void showB(){
        System.out.println("B类中numb:"+numb);
    }

    void showC(){
        System.out.println("C类中numc:"+numc);
    }
}
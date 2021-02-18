/**
 * @author yufeng1900
 * @create 2021-02-18 16:31
 */
public class Test5{
    public static void f()throws MyException{
        try{
            int[] a = {1,2,3};
            for (int i = 0; i < 4; i++) {
                System.out.println(a[i]);
            }
        }catch(Exception e){
            throw new MyException("发生数组越界错误");
        }
    }
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class MyException extends Exception{
    public MyException() {}
    public MyException(String msg) {
        super(msg);
    }
}

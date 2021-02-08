/**
 * @author yufeng1900
 * @create 2021-02-08 13:21
 */
public class Test9 {
    public static void main(String[] args) {
        Star star = new Star();
        Sun sun = new Sun();

        star.shine();
        System.out.println("======================");
        sun.doAnything();
        sun.shine();
    }
}

interface Universe{
    abstract void doAnything();
}

class Star{
    public void shine(){
        System.out.println("star:星星一闪一闪亮晶晶");
    }
}

class Sun extends Star implements Universe{
    @Override
    public void doAnything(){
        System.out.println("Sun:太阳吸引着九大行星旋转");
    }

    @Override
    public void shine(){
        System.out.println("Sun:光照八分钟到达地球");
    }
}
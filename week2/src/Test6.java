/**
 * @author yufeng1900
 * @create 2021-02-08 12:27
 */
public class Test6 {
    public static void main(String[] args) {
        Car car = new Car(4,1150,4);
        Truck truck = new Truck(6,15000,4,6000);

        System.out.println(car);
        System.out.println(truck);
    }
}

class Vehicle{
    int wheels;//轮子数
    double weight;//重量

    public Vehicle(){

    }

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }
}

class Car extends Vehicle{
    int loader = 5;//核载人数

    int trueLoader;

    public Car(int wheels,double weight,int trueLoader) {
        super(wheels,weight);
        this.trueLoader = trueLoader;
    }

    @Override
    public String toString(){
        String str = "车轮的个数是：" + wheels + "  车重：" + weight;
        if(trueLoader>loader) str = str + "\n这是一辆小车，荷载5人，实载"+trueLoader+"人，你超员了!\n";
        else str = str + "\n这是一辆小车，荷载5人，实载"+trueLoader+"人\n";
        return str;
    }
}

class Truck extends Vehicle{
    int loader = 3;
    double payload = 5000;

    int trueLoader;
    double truePayLoad;

    public Truck(int wheels,double weight,int trueLoader, double truePayLoad) {
        super(wheels,weight);

        this.trueLoader = trueLoader;
        this.truePayLoad = truePayLoad;
    }

    @Override
    public String toString(){
        String str = "车轮的个数是：" + wheels + "  车重：" + weight;
        if(trueLoader>loader) str = str + "\n这是一辆卡车，荷载3人，实载"+trueLoader+"人，你超员了!";
        else str = str + "\n这是一辆卡车，荷载3人，实载"+trueLoader+"人";

        if(truePayLoad>payload) str = str + "\n这是一辆卡车，荷载5000kg，实载"+truePayLoad+"kg，你超载了!\n";
        else return str = str + "\n这是一辆卡车，荷载5000kg，实载"+truePayLoad+"kg\n";

        return str;
    }
}
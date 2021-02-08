/**
 * @author yufeng1900
 * @create 2021-02-08 12:52
 */
public class Test7 {
    public static void main(String[] args) {
        Duck duck = new Duck("鸭子","发烧",2,"感冒");
        System.out.println(duck.showSymptom());
    }
}

abstract class Poultry{
    private String name;
    private String symptom;
    private int age;
    private String illness;

    public Poultry(){

    }

    public Poultry(String name, String symptom, int age, String illness) {
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public String getSymptom() {
        return symptom;
    }

    public int getAge() {
        return age;
    }

    public String getIllness() {
        return illness;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    abstract String showSymptom();

    public String showMsg(){
        return "动物种类：" + getName() + "年龄：" + getAge();
    }
}

class Duck extends Poultry{

    public Duck() {
    }

    public Duck(String name, String symptom, int age, String illness) {
        super(name, symptom, age, illness);
    }

    @Override
    String showSymptom() {
        return showMsg()+ "\n入院原因：" + getIllness() + "\n症状为：" + getSymptom();
    }
}
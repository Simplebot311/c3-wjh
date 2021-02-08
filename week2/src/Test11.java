import java.util.LinkedList;

/**
 * @author yufeng1900
 * @create 2021-02-08 13:28
 */
public class Test11 {
    public static void main(String[] args) {
        PetShop shop = new PetShop();
        shop.add(new Cat("波斯猫",1));
        shop.add(new Cat("布偶猫",2));
        shop.add(new Cat("波米拉猫",1));
        shop.add(new Dog("松狮",1));
        shop.add(new Dog("波尔多",2));
        shop.add(new Cat("波米拉猫",9));

        LinkedList<Pet> all = shop.search("波");
        Object obj[] = all.toArray();

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}

interface Pet{
    public String getName();
    public int getAge();
}

class PetShop{
    private LinkedList<Pet> pets = new LinkedList<Pet>();

    public void add(Pet pet){
        this.pets.add(pet);
    }

    public void delete(Pet pet){
        this.pets.remove(pet);
    }

    public LinkedList<Pet> search(String keyWord){
        LinkedList<Pet> result = new LinkedList<>();

        Object obj[] = this.pets.toArray();
        for (int i = 0; i < obj.length; i++) {
            Pet p = (Pet)obj[i];
            if(p.getName().contains(keyWord)){
                result.add(p);
            }
        }
        return result;
    }
}

class Cat implements Pet{
    private String name;
    private int age;

    public Cat(){

    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }

        if(obj==null){
            return false;
        }

        if(!(obj instanceof Cat)){
            return false;
        }
        Cat c = (Cat)obj;
        if(this.name.equals(c.name)&&this.age==c.age){
            return true;
        }
        return false;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return "猫的名字：" + this.name + "，年龄：" + this.age;
    }
}


class Dog implements Pet{
    private String name;
    private int age;

    public Dog(){

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }

        if(obj==null){
            return false;
        }

        if(!(obj instanceof Dog)){
            return false;
        }
        Dog d = (Dog)obj;
        if(this.name.equals(d.name)&&this.age==d.age){
            return true;
        }
        return false;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return "狗的名字：" + this.name + "，年龄：" + this.age;
    }
}
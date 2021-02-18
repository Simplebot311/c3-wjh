import java.util.LinkedList;

/**
 * @author yufeng1900
 * @create 2021-02-18 14:47
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("| ID\t| name\t| Salary\t| ManagerId |");
        System.out.println("+-------+-------+-----------+-----------+");
        LinkedList<Worker> list = new LinkedList<>();
        list.add(new Worker(1,"Joe",70000,"3"));
        list.add(new Worker(2,"Henry",80000,"4"));
        list.add(new Worker(3,"Sam",60000,"NULL"));
        list.add(new Worker(4,"Max",90000,"NULL"));

        Object[] obj = list.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}
class Worker{
    int Id;
    String name;
    double salary;
    String ManagerId;

    public Worker(int id, String name, double salary, String managerId) {
        Id = id;
        this.name = name;
        this.salary = salary;
        ManagerId = managerId;
    }

    @Override
    public String toString(){
        return "| "+Id+"\t\t| "+name+"\t| "+salary+"\t| "+ManagerId+" \t\t|";
    }
}
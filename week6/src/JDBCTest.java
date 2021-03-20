import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author yufeng1900
 * @create 2021-03-20 13:47
 */
public class JDBCTest {
    /*
    * 1.导入驱动
    * --->先复制，后 add as library
    * 2.注册驱动
    */
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/csa","root","root");
        //4.定义sql语句
        String createStudent = "CREATE TABLE student(" +
                "SNO VARCHAR(20)," +
                "NAME VARCHAR(10)," +
                "age INT," +
                "college VARCHAR(30)" +
                ");";

        String insert_1 = "INSERT INTO student" +
                "(SNO,NAME,age,college)" +
                "VALUES" +
                "('s001','老大',20,'计算机学院')," +
                "('s002','老二',19,'计算机学院')," +
                "('s003','老三',18,'计算机学院')," +
                "('s004','老四',17,'计算机学院');";

        String selectAll_2 = "SELECT * FROM student;";

        String deleteS004_3 = "DELETE FROM student WHERE SNO LIKE 's004';";

        String selectS003_4 = "SELECT * FROM student WHERE SNO LIKE 's003';";

        String updateS001_5 = "UPDATE student SET college = '通信学院' WHERE SNO LIKE 's001';";
        //5.获取执行sql的对象 Statement
        Statement stmt = connect.createStatement();
        //6.执行sql
        int count_0 = stmt.executeUpdate(createStudent);
        int count_1 = stmt.executeUpdate(insert_1);
        ResultSet count_2 = stmt.executeQuery(selectAll_2);
        int count_3 = stmt.executeUpdate(deleteS004_3);
        ResultSet count_4 = stmt.executeQuery(selectS003_4);
        int count_5 = stmt.executeUpdate(updateS001_5);
        //7.处理结果
        System.out.println(count_0);
        System.out.println(count_1);
        System.out.println(count_2);
        System.out.println(count_3);
        System.out.println(count_4);
        System.out.println(count_5);
        //8.释放资源
        stmt.close();
        connect.close();
        count_2.close();
        count_4.close();
    }
}

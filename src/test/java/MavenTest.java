import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MavenTest {

public static void main(String arg[])
{
     String url ="jdbc:mysql://localhost:3306/test";

     String users = "root";
     String password = "Kmc@00024";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(url,users,password);
            System.out.println("connection is successful"+ url);
            String query= "Insert into family ( id, name, age, place) values ( 1,'Ram',25,'Sec' )";
            Statement statement = con.createStatement();
            statement.execute(query);


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
            }
}}

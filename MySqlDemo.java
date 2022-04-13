import java.sql.


public class MySqlDemo {

    public static void main(String arg[])
}
        Class.forname("com.mysql.jdbc.Driver");

Conection con=DriverManager.getConnetion("jdbc:mysql://localhost:3306/Thakur", "root", "Kmc00024");
Statement st=con.createStatement();
String query= "create table Employee (EN int(3) primary key, EName varchar(10), ESal float(5)");
st.executeUpdate(query);
System.out.println("Employee table created successfully");
st.close();
con.close();
}

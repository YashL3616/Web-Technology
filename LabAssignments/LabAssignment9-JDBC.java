//Steps
/*
1.instal intellij with jdk kit
Java Development Kit (JDK):

Ensure you have JDK installed. You can download it from the Oracle website or use OpenJDK.

MySQL Database:
Install MySQL Server on your machine. You can download it from the MySQL website. https://dev.mysql.com/downloads/mysql/

MySQL Connector/J:
Download the MySQL Connector/J (JDBC driver) from the MySQL website. https://dev.mysql.com/downloads/connector/j/


2. Add .jar file in settings directories in modules in intellij

Create a db Yash in mysql cmd

create a table student and insert temporary values 1 , "yash",19
*/



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCConnec {
    public static void main(String[] args) {
        try{
            //Load database
            Class.forName("com.mysql.cj.jdbc.Driver");

            //establish connection with db Yash
            Connection connection=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Yash","root","password"
            );

            //Create a statement obj
            Statement statement=connection.createStatement();

            //Load data in resSet
            ResultSet resultSet=statement.executeQuery("SELECT * FROM students");
            System.out.println("Existing set");

            //retrieve
            while (resultSet.next())
            {
                System.out.println(resultSet.getInt(1)+"|"+resultSet.getString(2)+"|"+resultSet.getString(3));
            }

            //queries
            int insertCount=statement.executeUpdate("INSERT INTO students VALUES(2,'Ti',19)");
            System.out.println("Inserted "+insertCount);

            int UpdateCount=statement.executeUpdate("UPDATE students SET age=18 WHERE id=1");
            System.out.println("Updated "+UpdateCount);

            int DelCount=statement.executeUpdate("DELETE FROM students Where id=2");
            System.out.println("Deleted "+DelCount);

            //close
            connection.close();
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

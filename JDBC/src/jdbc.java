import java.sql.*;
import java.util.Scanner;

public class jdbc {


    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        //Register the Driver class - connect mysql to intellij using DBNavigator

        // Create Connection
        String host="jdbc:mysql://localhost:3306/employeedb";
        String username="root";
        String password="Htanirhs@17";

        try {
            Connection connection= DriverManager.getConnection(host,username,password);

            // Create Statement
             Statement statement=connection.createStatement();

            // Execute queries
            String getdata="select * from employee";
            String update="update employee set surname='Musane' where Name='Sujit'";
//            String insert="insert into employee values(8,'Dev','Wan','Nagpur',412507)";
//            String delete="DELETE FROM employee WHERE (`ID` = '4');";
//            boolean insrt=statement.execute(insert);
//            boolean delet= statement.execute(delete);
//            PreparedStatement preparedStatement= connection.prepareStatement(insert);
//            boolean inst= preparedStatement.execute();
            int updt= statement.executeUpdate(update);
//            if(updt>0){
//                System.out.println("updated");
//            }
            ResultSet resultset=statement.executeQuery(getdata);



            while(resultset.next()){
                System.out.println("ID :"+resultset.getInt(1));
                System.out.println("Name :"+resultset.getString(2));
                System.out.println("Surname :"+resultset.getString(3));
                System.out.println("Location :"+resultset.getString(4));
                System.out.println("Pincode :"+resultset.getInt(5));
                System.out.println("");
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        // Close Connection


    }
}


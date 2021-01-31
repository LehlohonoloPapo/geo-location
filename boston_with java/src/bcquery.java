import java.sql.*;
public class bcquery {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection(
                    "jdbc:mysql://localhost/boston","root","1445papo"
            );
            Statement stmt =con.createStatement();
            ResultSet rs= stmt.executeQuery("select * from crime");
            while(rs.next())
                System.out.println(rs.getString(0));


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}

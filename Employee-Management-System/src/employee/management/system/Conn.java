package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem.employee", "root", "Aapple@#$1");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

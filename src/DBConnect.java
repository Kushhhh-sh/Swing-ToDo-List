
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kush3
 */
public class DBConnect {
    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:tasks.db");
            return conn;
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Connection to the Database Failed!!", "Database Connection", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}


import java.sql.*;
import java.util.*;
public class EmployeeDAO {

    public EmployeeDAO() throws SQLException, ClassNotFoundException {
        Connection conn = DBConnection.Connection();
        
        Statement stmt1 = conn.createStatement();
        stmt1.execute("DROP TABLE IF EXISTS employee;");
        
        Statement stmt = conn.createStatement();
        String query = "CREATE TABLE employee (emp_id INT(10),name VARCHAR(25),email VARCHAR(25),contact_number VARCHAR(25),salary double);";
        stmt.execute(query);
    }


    public void insert(Employee employee) throws SQLException, ClassNotFoundException  {
        // write your code here
    }

    public boolean update(int empId, Double salary) throws SQLException, ClassNotFoundException  {
        // write your code here
    }

    public boolean delete(int empId) throws SQLException, ClassNotFoundException  {
        // write your code here
    }

    public ArrayList<Employee> getAllEmployees() throws SQLException, ClassNotFoundException {
        // write your code here
    }
}


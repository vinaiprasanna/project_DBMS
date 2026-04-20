
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
        String query = "INSERT INTO employee (emp_id, name, email, contact_number, salary) VALUES (?,?,?,?,?)";
        Connection conn = DBConnection.obtainConnection();
        PreparedStatement psmt = conn.prepareStatement (query);
        psmt.setInt(1, employee.getEmpId());
        psmt.setString(2, employee.getName());
        psmt.setString(3, employee.getEmail());
        psmt.setString(4, employee.getContactNumber());
        psmt.setDouble(5, employee.getSalary());
        psmt.executeUpdate();
    }

    public boolean update(int empId, Double salary) throws SQLException, ClassNotFoundException  {
        // write your code here
        String query = "DELETE FROM employee WHERE emp_id = ?";
        try (Connection conn = DBConnection.obtainConnection();
        PreparedStatement psmt = conn.prepareStatement (query)){
        psmt.setInt(1,empId);
        int rows = psmt.executeUpdate();
        return rows > 0;
        }
    }

    public boolean delete(int empId) throws SQLException, ClassNotFoundException  {
        // write your code here
        String query = "DELETE FROM employee WHERE emp_id = ?";
        try (Connection conn = DBConnection.obtainConnection();
        PreparedStatement psmt = conn.prepareStatement (query)){
        psmt.setInt(1,empId);
        int rows = psmt.executeUpdate();
        return rows > 0;
        }
    }

    public ArrayList<Employee> getAllEmployees() throws SQLException, ClassNotFoundException {
        // write your code here
        ArrayList<Employee> employees = new ArrayList<>();
        String query = "SELECT * FROM employee";
        try (Connection conn = DBConnection.obtainConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query)) {
        while (rs.next()){
            Employee emp = new Employee(
                rs.getInt("emp_id"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("contact_number"),
                rs.getDouble("salary")
            );
        employees.add(emp);
        }
    return employees;
    }
}


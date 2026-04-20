import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isExit = false;
        EmployeeDAO edo = new EmployeeDAO();
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        while (!isExit) {
            System.out.println("1.Insert\n2.Select\n3.Update\n4.Delete\n5.Exit\nEnter your choice:");
            int n = Integer.parseInt(br.readLine());
            switch(n) {
                case 1:
            		System.out.println("Enter the employee id:");
	            	int empId = Integer.parseInt(br.readLine());
	            	System.out.println("Enter the employee name:");
	            	String name = br.readLine();
	            	System.out.println("Enter the email address:");
	            	String email = br.readLine();
	            	System.out.println("Enter the contact number:");
	            	String contactNo = br.readLine();
	            	System.out.println("Enter the salary:");
            		Double salary = Double.parseDouble(br.readLine());
	            	// write your code for insertion
            		break;
            	case 2:
            		// write your code for selection
            		break;
            	case 3:
            		// write your code for updation
            		break;
            	case 4:
            		// write your code for deletion
            		break;
            	case 5:
            		// write your code here
            		break;
        	default:
        		// write your code here
                    	break;
        			
            }
        }
    }

}


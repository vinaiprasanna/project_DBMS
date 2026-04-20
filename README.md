**project_DBMS**

A DBMS-based application that provides efficient data storage, retrieval, and management. It includes features like CRUD operations, relational schema design, normalization, and optimized SQL queries.

**📌 Employee Management System using JDBC**

This project demonstrates the implementation of basic CRUD (Create, Read, Update, Delete) operations using JDBC (Java Database Connectivity) with a MySQL database. It is designed to showcase how Java applications interact with relational databases.

**🚀 Features**

- Insert new employee records
- Retrieve and display employee details
- Update employee salary
- Delete employee records
- Proper handling of empty tables and invalid operations
- Formatted output display using System.out.format

**🏗️ Project Structure**

 1. Employee.java

Represents the Employee entity with the following attributes:

- empId (Integer)
- name (String)
- email (String)
- contactNumber (String)
- salary (Double)

Includes:

- Constructors
- Getters and Setters

 2. EmployeeDAO.java

Handles all database operations:

- insertEmployee(Employee emp)
- getAllEmployees()
- updateEmployeeSalary(int empId, double salary)
- deleteEmployee(int empId)

 3. DBConnection.java

- Establishes connection to MySQL database using JDBC
- Returns Connection object

 4. Main.java

- Provides a menu-driven interface
- Allows user to perform CRUD operations

 **🛠️ Technologies Used**

- Java
- JDBC API
- MySQL Database

**🗄️ Database Table Structure**

CREATE TABLE employee (
    empId INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    contactNumber VARCHAR(15),
    salary DOUBLE
); 

✅ Functional Behavior

**Insert**

On success → Record Inserted

**Select**

If no records → Table is empty
Otherwise → Displays all employee records

**Update**

If employee not found → Employee Record not found
On success → Record Updated

**Delete**

If employee not found → Employee Record not found
On success → Record Deleted

**⚙️ Setup Instructions**

Install MySQL and create the database

Create the employee table using the given SQL query

Update database credentials in DBConnection.java

Compile and run the project:



**🎯 Purpose**

This project is ideal for:

-Students learning DBMS and JDBC
-Understanding real-time database interaction in Java
-Practicing CRUD operations with structured data


**📌 Author**

Developed as part of a DBMS academic project.

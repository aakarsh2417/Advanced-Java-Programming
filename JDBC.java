import java.sql.*;
public class Shiv
{
static final String DB_URL = "jdbc:mysql://localhost:3306/?user=root";
static final String USER = "root";
static final String PSWD = "nikhil1234";
public static void main (String[] args) throws Exception
{
Connection con = null;
Statement stmt = null;
Class.forName("com.mysql.jdbc.Driver");
System.out.println("Connecting to Database");
con = DriverManager.getConnection(DB_URL,USER,PSWD);
System.out.println("Creating Database");
stmt = con.createStatement();
String sql = "CREATE DATABASE TESTING";
stmt.executeUpdate(sql);
System.out.println("Database Created Successfully");
con.close();
stmt.close();
}
}

package jdbc;
import java.sql.*;
public class CreateTable {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VSP","root","varadsp123");
		Statement st = con.createStatement();
		String sql = "create table vspemployee(empno int(5) primary key,ename varchar(30),sal float(10,2))";
		try{
			st.execute(sql);
			System.out.println("DB TABLE CREATED");
		}
		catch(Exception e){
			System.out.println("Error " + e.toString());
			
		} 
	}

}

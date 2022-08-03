package demo;
import java.sql.*;

public class DemoClass {

	public static void main(String[] args) throws Exception{
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String uname="root";
		String pass="Nandy*16";
		String query="select * from account";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		String userData="";
		while(rs.next())
		{
			userData=rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getInt(4);
			System.out.println(userData);
		}
		
		st.close();
		con.close();
		
				


	}

}

import java.sql.*;

public class DemoMysql
{
	public static void main(String[] args) throws Exception
	{

	String url="jdbc:mysql://localhost:3306/Aliens";
	String uname="root";
	String pwd="password";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pwd);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from school");

	while(rs.next())
	{
	System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getString(3));
	
	} 
	con.close();
	}

}
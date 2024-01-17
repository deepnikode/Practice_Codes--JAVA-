import java.sql.*;

public class DemoOracle
{
	public static void main(String[] args) throws Exception
	{

	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String uname="system";
	String pwd="password";
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection(url,uname,pwd);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from employeess");

	while(rs.next())
	{
	System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getString(3));
	
	} 
	con.close();
	}

}
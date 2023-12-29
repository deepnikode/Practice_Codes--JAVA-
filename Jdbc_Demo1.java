import java.sql.*;

class Jdbc_Demo1
{
	public static void main(String[] args) throws Exception
	{

	
	Class.forName("oracle.jdbc.driver.OracleDriver");


	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl","system","password");
	
	Statement st=con.createStatement();

	ResultSet rs=st.executeQuery("select * from movies");

	while(rs.next())
	{
	System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getString(3)+"--"+rs.getString(4));
	}
	
	con.close();
	

	}
}
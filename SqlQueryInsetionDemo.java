import java.util.*;
import java.sql.*;

class SqlQueryInsetionDemo
{
	public static void main(String[] args)
	{

	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter Roll no.");
	int rno=sc.nextInt();
	
	System.out.println("Enter name");
	String name=sc.next();
	
	System.out.println("Enter percentage");
	float per=sc.nextFloat();

	System.out.println("Favourite Sport");
	String sport=sc.next();

	
	String sqlQuery="insert into Students values("   +rno+ ",'"+name+ "',"+per+",'"+sport+"')";
	System.out.println(sqlQuery);
	}

}
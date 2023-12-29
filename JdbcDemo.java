class Demo
{
	static 
	{
	System.out.println("I am in Static Block");
	}
}

class JdbcDemo
{
	public static void main(String[] args) throws Exception
	{
	Class.forName("Demo");
	}
	
} 

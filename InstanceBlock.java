class Demo
{	
	Demo()
	{
	System.out.println("In Constructor");
	}

	{
	System.out.println("I am in Instance Block");
	}
	static
	{
	System.out.println("In Static Block");
	}
}




class InstanceBlock
{

	public static void main(String[] args)
	{
	
		
	Demo d=new Demo();


	}



}
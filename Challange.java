public class Challange
{
	public static void main(String[] args)
	{
	
	Test t1=new Test();
	t1.a=20;
	System.out.println(t1.a);

	Test t2=new Test();
	t2.a=50;
	System.out.println(t2.a);
	
	Test.a=100;
	System.out.println(Test.a);
	System.out.println(t1.a);
	System.out.println(t2.a);
	}
}
	class Test
	{
	static int a;
	}
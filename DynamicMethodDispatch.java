class A
{
	public void show()
	{System.out.println("In Show A");}
}
class B extends A
{
	
	public void show()
	{System.out.println("In Show B");}

}
class C extends B
{
	
	public void show()
	{System.out.println("In Show C");}
}

class DynamicMethodDispatch
{
	public static void main(String[] args)
	{
	A c=new C();
	c.show();
	
	A b=new B();
	b.show();

	A a=new A();
	a.show();
	}
}
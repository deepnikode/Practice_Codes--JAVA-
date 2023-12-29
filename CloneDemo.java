class CloneDemo implements Cloneable
{
	int i=28;
	int j=25;

	public static void main(String[] args) throws CloneNotSupportedException
	{
	CloneDemo c1=new CloneDemo();
	CloneDemo c2=(CloneDemo)c1.clone();
	c2.i=78;
	c2.j=86;
	System.out.println(c1.i+"--"+c1.j);
	System.out.println(c2.i+"--"+c2.j);
	}	
}
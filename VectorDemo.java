import java.util.*;

class VectorDemo
{
	public static void main(String[] args)
	{
	Vector v=new Vector();
	System.out.println(v.capacity());
	for(int i=1;i<=10;i++)
	{
	v.addElement(i);
	}
	v.addElement("A");
	System.out.println(v.capacity());
	System.out.println(v);
	}
}
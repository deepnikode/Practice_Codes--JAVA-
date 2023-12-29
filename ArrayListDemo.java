import java.util.*;

class ArrayListDemo
{
	public static void main(String[] args)
	{
	ArrayList l=new ArrayList();
	l.add(20);	
	l.add("A");
	l.add("D");	
	l.add(70);

	System.out.println(l);
	l.set(2,"A");
	System.out.println(l);
	l.clear();
	System.out.println(l);
	
	}
}
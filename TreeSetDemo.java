import java.util.*;
class TreeSetDemo
{
	public static void main(String[] args)
	{
	TreeSet t=new TreeSet();
	t.add("Z");
	t.add("z");
	t.add("A");
	t.add("a");
	
	
	System.out.println(t);
	System.out.println(t.add("A"));
	System.out.println("According to some Sorting Order");
	}
}
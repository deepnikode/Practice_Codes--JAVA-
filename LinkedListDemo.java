import java.util.*;

class LinkedListDemo
{
	public static void main(String[] args)
	{
	LinkedList l=new LinkedList();
	l.add("First");
	l.add("Anjali");
	l.add(2000);
	l.add("Deep");
	l.add("Deep");
	l.add(30);
	l.add(null);
	l.add("Anjali");
	l.add("Last");
	
	l.set(2,6000);
	l.removeFirst();
	l.removeLast();
	
	System.out.println(l);
	}
}
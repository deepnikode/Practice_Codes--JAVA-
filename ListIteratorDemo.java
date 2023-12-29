import java.util.*;

class ListIteratorDemo
{
	public static void main(String[] args)
	{
	LinkedList l=new LinkedList();
	
	l.add("Deep");l.add("Nikode");l.add("Anjali");l.add("Vaidya");

	System.out.println(l);
	ListIterator litr=l.listIterator();
	
	while(litr.hasNext())
	{

	String s= (String)litr.next();

	
	
	if(s.equals("Vaidya"))
	{litr.set("Nikode");}
	}
	System.out.println(l);
	
	
	}
}
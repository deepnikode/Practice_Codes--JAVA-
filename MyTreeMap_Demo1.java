import java.util.*;

class MyTreeMap_Demo1
{
	public static void main(String[] args)
	{
	TreeMap t= new TreeMap(new MyComparator());

	t.put("Anu","Deep");t.put("Katrina","Ladoo");t.put("Shreya","Arti");t.put("Heena","Anjali");
	System.out.println(t);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
	String s1=obj1.toString();
	String s2=obj2.toString(); /* Ascending Order */
	
	/* Ascending Order 
	return s1.compareTo(s2); */  

	/* Descending Order */
	return -s1.compareTo(s2);

	}
}
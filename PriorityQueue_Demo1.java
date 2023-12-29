import java.util.*;
import java.lang.*;

class PriorityQueue_Demo1
{
	public static void main(String[] args)
	{
	PriorityQueue q=new PriorityQueue(new MyComparator());
		
	q.offer("D");
	q.offer("Y");
	q.offer("Z");
	q.offer("B");
	
	System.out.println(q);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
	String s1=obj1.toString();
	String s2=obj2.toString();
	return -s2.compareTo(s1);
	}
}


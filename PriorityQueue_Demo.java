import java.util.*;
import java.lang.*;

class PriorityQueue_Demo
{
	public static void main(String[] args)
	{
	PriorityQueue q=new PriorityQueue(new MyComparator());
	/* System.out.println(q.peek()); 
	System.out.println(q.element()); */
	
	for(int i=0;i<=10;i++)
	{
	q.offer(i);
	}
	System.out.println(q.poll()+"***Removedand returned  first element of queue");
	System.out.println(q);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
	int i1=(int)obj1;
	int i2=(int)obj2;
	
	if(i1<i2)
	return 1;

	
	else if(i1>i2)
	return -1;
	
	else 
	return 0;
	}
}
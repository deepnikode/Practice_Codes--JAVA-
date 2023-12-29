import java.util.*;
class ComparatorTestDemo
{
	public static void main(String[] args)
	{
	TreeSet t=new TreeSet(new MyComparator());
	
	t.add(1);
	t.add(5);
	t.add(3);
	t.add(4);
	
	System.out.println(t);
	}

}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
	int i1=(int)obj1;
	int i2=(int)obj2;
	
	
	if(i1<i2)
	return +1;
	else if(i1>i2)
	return -1;
	else 
	return 0;
	
	
	
	
	// return i1.compareTo(i2) o/p : Ascending Order;
	// return -i1.compareTo(i2) o/p : Desending Order; 
	
		





	
	
	}
}
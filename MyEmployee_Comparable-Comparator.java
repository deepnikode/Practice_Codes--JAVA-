import java.lang.*;
import java.util.*;

class  MyEmployee_Comparable_Comparator
{

	public static void main(String[] args)
	{
	Employee e1=new Employee(10,"Deep");
	Employee e2=new Employee(3,"Shivam");
	Employee e3=new Employee(6,"pratik");
	Employee e4=new Employee(1,"Anjali");
	Employee e5=new Employee(2,"Arti");

	TreeSet t=new TreeSet();

	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	t.add(e5);

	System.out.println(t);

	TreeSet t1=new TreeSet(new MyComparator());
	
	t1.add(e1);
	t1.add(e2);
	t1.add(e3);
	t1.add(e4);
	t1.add(e5);

	System.out.println(t1);
	}

}



class Employee implements Comparable
{

	int eid;
	String name;

	Employee(int eid, String name)
	{
	this.eid=eid;
	this.name=name;
	}

	public String toString()
	{
		return (eid+"---"+ name);
	}
	
	
	public int/*(obj1)*/ compareTo(Object obj/*(obj2)*/)
	{

	int eid1=this.eid;
	Employee e=(Employee)obj;
	int eid2=e.eid;

	if(eid1<eid2)
	return 1;
	else if(eid1>eid2)
	return -1;
	else
	return 0;

	}
	
}

class MyComparator implements Comparator
{
    	public int compare(Object obj1,Object obj2)
	{
    	Employee e1=(Employee)obj1;
    	Employee e2=(Employee)obj2;

    	String s1=e1.name;
    	String s2=e2.name;

	return s1.compareTo(s2);

	}
}

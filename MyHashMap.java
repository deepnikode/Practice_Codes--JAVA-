import java.util.*;
import java.lang.*;

class MyHashMap
{

	public static void main(String[] args)
	{
	HashMap m=new HashMap();

	m.put("Suresh",67);	
	m.put("Deep",97);
	m.put("Nikode",7);

	/*
	System.out.println(m);
	System.out.println(m.keySet());
	System.out.println(m.values());
	*/
	
	Set s=m.entrySet();

	System.out.println(s);

	Iterator itr=s.iterator();
	
	while(itr.hasNext())
	{
	Map.Entry er=(Map.Entry)itr.next();

	System.out.println(er.getKey()+"---"+er.getValue());
	}

	}
}
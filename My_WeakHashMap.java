import java.lang.*;
import java.util.*;

class My_WeakHashMap
{
	public static void main(String[] args)
	{
	Temp t=new Temp();	
	
	/*
	HashMap w=new HashMap(); Output:{temp=Deep}
	*/

	WeakHashMap w=new WeakHashMap();

	w.put(t,"Deep");
		
	t=null;
	System.gc();
	System.out.println(w);
	}
}


class Temp
{

	public String toString()
	{
	return "temp";
	}
	
	/*public void finalize()
	{
	System.out.println("I am in Finalize Method");
	}*/

}
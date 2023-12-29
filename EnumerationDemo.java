import java.util.*;

class EnumerationDemo
{
	public static void main(String[] args)
	{
	Vector v=new Vector();
	for(int i=0;i<=10;i++)
	{
	v.add(i);
	}

	Enumeration e=v.elements();
	
	while(e.hasMoreElements())
	{
	int I=(int)e.nextElement();
	if(I%2==0)
	{System.out.print(I+" ");}
	}
	
	}
}
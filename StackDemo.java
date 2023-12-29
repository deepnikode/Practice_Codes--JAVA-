import java.util.*;

class StackDemo
{
	public static void main(String[] args)
	{
	Stack s=new Stack();
	s.push("A");
	s.push("N");
	s.push("U");
	s.push("1");
	System.out.println(s);
	System.out.println(s.search("A"));
	System.out.println(s.indexOf("N"));
	}	
}
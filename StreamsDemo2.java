import java.util.*;
import java.util.stream.*;

class StreamsDemo2
{
	public static void main(String[] args)
	{
	ArrayList<String> names=new ArrayList<String>();

	names.add("AA");
	names.add("AAAAA");
	names.add("A");
	names.add("AAAA");
	names.add("AAA");
	

	System.out.println(names);
	
	Comparator <String> c = 
	(s1,s2)->
	{
	int l1=s1.length();
	int l2=s2.length();
	if(l1>l2) return -1;
	else if(l1<l2) return +1;
	else return s1.compareTo(s2);
	};
	/*DESCENDING ORDER*/	
	List<String> CostumizedSortedOrder=names.stream().sorted(c).collect(Collectors.toList());
	
	
	
	System.out.println(CostumizedSortedOrder);
	}
} 
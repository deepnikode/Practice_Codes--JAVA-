import java.util.*;
import java.util.stream.*;

class Streams
{
	public static void main(String[] args)
	{
	ArrayList<Integer> marks=new ArrayList<Integer>();
	marks.add(10);
	marks.add(11);
	marks.add(12);
	marks.add(13);
	System.out.println(marks);
	List<Integer> finalList=marks.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(finalList);
	}
}
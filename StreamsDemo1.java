import java.util.*;
import java.util.stream.*;

class StreamsDemo1
{
	public static void main(String[] args)
	{
	ArrayList<Integer> marks=new ArrayList<Integer>();

	marks.add(80);
	marks.add(31);
	marks.add(52);
	marks.add(83);
	marks.add(22);

	System.out.println(marks);
	
	long noOFFailedStudents=marks.stream().filter(i->i<33).count();
	System.out.println(noOFFailedStudents);

	List<Integer> sortedOrder=marks.stream().sorted().collect(Collectors.toList());
	System.out.println(sortedOrder); /*ASCENDING ORDER*/	

	List<Integer> CostumizedSortedOrder=marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
	System.out.println(CostumizedSortedOrder); /*DESCENDING ORDER*/
	

	}
} 
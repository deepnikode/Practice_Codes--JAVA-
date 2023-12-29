class Mobile
{
	String brand;
	int prize;
	
	
	public void show()
	{
	System.out.println(brand+" : "+prize);
	}

}

public class Revision1
{
	
public static void main(String[] args)
{

	Mobile obj1=new Mobile();
	obj1.brand="appple";
	obj1.prize=1000;

	Mobile obj2=new Mobile();
	obj2.brand="Samsung";
	obj2.prize=2000;

	obj1.show();
	obj2.show();
}

}
	



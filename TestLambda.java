interface Interef
{
	public void wishing(int time,String name);
}

class wish implements Interef
{
	public void wishing(int time,String name)
	{

	for(int i=1;i<=time;i++)
	{
		System.out.println(" Good Morning"+name);

		try
		{Thread.sleep(1000);}
		catch(InterruptedException e)
		{}
	}
	}

}


class TestLambda
{
	public static void main(String[] args)
	{
	Interef i=new wish();
	i.wishing(17,"Deep");
	}
}
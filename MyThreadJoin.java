class MyThread extends Thread
{
	public void run() 
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Ram-Jii");

			try
			{
			Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{}
		}
		
	}
}

class MyThreadJoin
{
	public static void main(String[] args) 
	{
	MyThread t=new MyThread();
	t.start();

	try 
	{
	t.join();
	} 
	catch (InterruptedException e)
	{}
		
		for(int i=0;i<=10;i++)
		{
		System.out.println("Sita-Jii");
		}
	}

}
class MyThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
		System.out.println("In My Thread");
		}
	}
}

class MyThreadDemo2
{
	public static void main(String[] args)
	{
	
	MyThread t1=new MyThread();
	Thread t=new Thread(t1);
	t.start();

		for(int i=0;i<=10;i++)
		{
		System.out.println("In Main Thread");
		}
	}
}
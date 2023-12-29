class MyThread extends Thread
{
	public void run()
	{
	
		System.out.println("Child"+Thread.currentThread().getName());
		
		for(int i=0;i<=10;i++)
		{
		System.out.println("In My Thread");
		}
	}
}

class MyThreadDemo3
{
	public static void main(String[] args)
	{
	
	MyThread t1=new MyThread();
	t1.setPriority(10);
	t1.start();
		
	System.out.println("Main"+Thread.currentThread().getName());
		for(int i=0;i<=10;i++)
		{
		System.out.println("In Main Thread");
		}
	}
}
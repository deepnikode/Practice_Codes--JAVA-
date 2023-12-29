class Display
{

public synchronized void displaynum()
{
	for(int i=1;i<=10;i++)
	{
	System.out.println(i);

	try
	{
	Thread.sleep(2000);
	}
	catch(InterruptedException e)
	{}

	}
	
}

public synchronized void displaychar()
{
	for(int i=65;i<=75;i++)
	{
	System.out.println((char)i);

	try
	{
	Thread.sleep(2000);
	}
	catch(InterruptedException e)
	{}

	}
	
}

}

class MyThread1 extends Thread
{
	Display d;
 	MyThread1(Display d)
	{
	this.d=d;
	}
	public void run()
	{
	d.displaynum();
	}	
}

class MyThread2 extends Thread
{
	Display d;
 	MyThread2(Display d)
	{
	this.d=d;
	}
	public void run()
	{
	d.displaychar();
	}	
}


class SyncDemo99
{
	

	public static void main(String[] args)
	{
	Display d = new Display();
	MyThread1 t1=new MyThread1(d);
	MyThread2 t2=new MyThread2(d);
	t1.start();
	t2.start();
	}
}
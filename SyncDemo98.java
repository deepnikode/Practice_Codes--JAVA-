class Display
{
	public synchronized void wish(String name)
	{
	System.out.print("Good Morning :");
	try{Thread.sleep(1000);}
	catch(InterruptedException e){}
	System.out.print(name +" ");
	
	}
}

class MyThread extends Thread
{
	Display d;
	String name;

	MyThread(Display d,String name)
	{
	this.d=d;
	this.name=name;
	}
	
	public void run()
	{
	d.wish(name);
	}
}

class SyncDemo98
{
	public static void main(String[]args)
	{
	Display d=new Display();
	
	MyThread t1=new MyThread(d,"Deep");
	t1.start();
	MyThread t2=new MyThread(d,"Anjali");
	t2.start();
	}
}
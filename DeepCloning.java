class Cat
{	int j;
	Cat(int j)
	{
	this.j=j;
	}
}

class Dog implements Cloneable
{	
	Cat c;
	int i;
	Dog(Cat c,int i)
	{
	this.c=c;
	this.i=i;
	}

	public Object clone() throws CloneNotSupportedException
	{
	Cat c1=new Cat(c.j);
	Dog d1=new Dog(c1,i);
	return d1;
	}
}

class DeepCloning
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
	Cat c=new Cat(40);
	Dog d=new Dog(c,80);
	
	System.out.println(d.i+"--"+d.c.j);
	Dog d1=(Dog)d.clone();
	d1.i=4000;
	d1.c.j=8000;
	System.out.println(d1.i+"--"+d1.c.j);	
	}
}


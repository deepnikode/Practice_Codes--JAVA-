import java.io.*;

class Dog implements Serializable
{
Cat c=new Cat();
}

class Cat implements Serializable
{
Rat r=new Rat();
}

class Rat implements Serializable
{
int j=10;
}


class SerializationDemo99
{
	public static void main (String[] args) throws Exception
	{
	Dog d1=new Dog();
	
	FileOutputStream fos = new FileOutputStream("dsn.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(d1);
	
	FileInputStream fis = new FileInputStream("dsn.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Dog d2 = (Dog)ois.readObject();

	System.out.println(d2.c.r.j);
	}
}


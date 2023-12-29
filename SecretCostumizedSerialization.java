import java.io.*;

class Account implements Serializable
{
String uname="Deep";
transient String pwd="Pass@123";
transient int pin=9359; 

	private void writeObject(ObjectOutputStream os) throws Exception
	{
	os.defaultWriteObject();

	String epwd="123"+pwd;
	os.writeObject(epwd);

	int epin=444+pin;
	os.writeInt(epin);
	}

	private void readObject(ObjectInputStream is) throws Exception
	{
	is.defaultReadObject();

	String epwd=(String)is.readObject();
	pwd=epwd.substring(3);

	int epin=is.readInt();
	pin=epin-444;
	}
}

class SecretCostumizedSerialization
{
	public static void main(String[] args) throws Exception
	{
	Account a1=new Account();
	System.out.println(a1.uname+"---"+a1.pwd+"---"+a1.pin);
	
	FileOutputStream fos =new FileOutputStream("xyz.ser");
	ObjectOutputStream oos =new ObjectOutputStream(fos);
	oos.writeObject(a1);

	FileInputStream fis=new FileInputStream("xyz.ser");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Account a2=(Account)ois.readObject();
	
	System.out.println(a2.uname+"---"+a2.pwd+"---"+a2.pin);
	
	}
}
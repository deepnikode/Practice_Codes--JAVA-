import java.io.*;
class Account implements Serializable
{
String uname="Deep";
String pwd="Anjali";

	private void writeObject(ObjectOutputStream os) throws Exception
	{
	os.defaultWriteObject();
	String epwd="123"+pwd;
	os.writeObject(epwd);

	} 
	
	private void readObject(ObjectInputStream is) throws Exception
	{
	is.defaultWriteObject();
	String epwd=(string)is.readObject();
	String pwd=epwd.subString(3);
	}
}

class CostumizedExceptionFinal
{
	public static void main(String[] args) throws Exception
	{
	Account a1=new Account();
	
	System.out.println(a1.uname+"---"+a1.pwd);

	FileOutputStream fos= new FileOutputStream("abc.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(a1);

	FileInputStream fis =new FileInputStream("abc.ser");
	ObjectInputStream ois =new ObjectInputStream(fis);
	Account a2=(Account)ois.readObject();

	System.out.println(a2.uname+"---"+a2.pwd);	
	}
}
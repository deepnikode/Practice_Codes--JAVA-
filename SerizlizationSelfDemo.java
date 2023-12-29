import java.io.*;
class Cow implements Serializable
{
int i=10;
int j=20;
}

class SerizlizationSelfDemo 
{
public static void main(String[] args) throws Exception
{
Cow c=new Cow();

FileOutputStream fos=new FileOutputStream("xyz.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(c);

FileInputStream fis=new FileInputStream("xyz.txt");
ObjectInputStream ois = new ObjectInputStream(fis);
Cow c1=(cow)ois.readObject();

System.out.println(c1.i+"----"c1.j);

}
}
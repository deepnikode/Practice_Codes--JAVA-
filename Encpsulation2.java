class Human
{
private String name;
private int age;

public void setName(String n)
{
name=n;
}
public String getName()
{
return name;
}
public void setAge(int a)
{
age=a;
}
public int getAge()
{
return age;
}
}

class Encpsulation2
{
public static void main(String[] args)
{
Human hu=new Human();
hu.setName("Deep");
hu.setAge(23);

System.out.println(hu.getName());
System.out.println(hu.getAge());
}
}
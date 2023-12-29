class Human
{
private String name="Deep";
private int age=23;

public String getName()
{
return name;
}

public int getAge()
{
return age;
}

}

public class Encapsulation
{

public static void main(String[] args)
{

Human hu=new Human();

System.out.println(hu.getName());
System.out.println(hu.getAge());


}

}
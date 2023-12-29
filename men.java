class Atm
{	int bal=500;
 
	public void withdraw(int amt)
	{

	if(amt>bal)
	{
	throw new InsufficientFundsException("No Money Baby") ;}
	}
}
class InsufficientFundsException extends RuntimeException
{
	InsufficientFundsException(String s)
	{ super(s); }

}




class men
{
	public static void main(String[] args)
	{

	Atm a=new Atm();
	a.withdraw(1000);
	System.out.println("Deep");
	}
}
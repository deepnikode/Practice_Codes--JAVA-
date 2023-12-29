class MagicSum
{
	public int sum(int n1,int n2)
	{
		for(int i=n2;i<=1;i--)
		{
		n1++;
		}
		return (n1+n2);
	}
}

class Trick
{
	public static void main(String[] args)
	{
	MagicSum m=new MagicSum();
	int summ=m.sum(2,4);
	System.out.println(summ);
		
	}

}
interface Interef
{
public int square(int n);
}

class TestLambda1
{
	public static void main(String[] args)
	{
	Interef i=n->n*n;
	System.out.println(i.square(4));	
	}
}
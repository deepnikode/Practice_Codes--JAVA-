class Test
{
	public static void main(String[] args)
	{
	char character='A';
	
	int ascii=(int)character;
	System.out.println("Ascii Value is:"+ascii);
	int sum=0;
	for(int i=ascii;i<(ascii+5);i++)
	{
	sum=sum+i;
	}
	System.out.println(sum);
	}
}


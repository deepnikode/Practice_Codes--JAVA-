class Testdeeppallindrom
{
	public static void main(String[] args)
	{
	String s="Deep";
	
	
	char []a1=new char[1000];
	char []b1=new char[1000];
		
	for(int i=0;i<s.length();i++)
	{
	a1[i]=s.charAt(i);
	}




	for(int i=s.length()-1; i>=0; i--)
	{
	
	for(int j=0; j<s.length()-1; j++)
	{
	b1[j]=a1[i];
	}

	}

		for(int i=0;i<s.length();i++)
		{
		System.out.print(b1[i]);
		System.out.print("Deep");
		
		}

	
	
	



	}	

	
}
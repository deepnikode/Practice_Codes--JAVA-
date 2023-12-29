class QueStr
{
	public static void main(String[] args)
	{
	String s="Hello Deep";

	

	char[] a=new char[1000];
	
	for(int i=0;i<s.length();i++)
	{
	a[i]=s.charAt(i);
	System.out.print(a[i]);
	
	}

	System.out.println();

	for(int j=s.length()-1;j>=0;j--)
	{
	
	System.out.print(a[j]);
	
	}
	
	
	
	
	
	}

}
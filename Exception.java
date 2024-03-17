 class Except
{
	public static void main(String []args)
	{
	int a=5;
int b=0;
try
{
	if(b==0)
	{
		throw new ArithmeticException("Why you are dividing with 0");
	}
System.out.println(a/b);
}	
catch(NullPointerException e1)
{
System.out.println(e1.getMessage());	
}
finally
{
System.out.println("Finally Exceuted.");	
}
System.out.println("Normal Line");	
}
}
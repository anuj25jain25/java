class Simple
{
	static int a;
	static int b;
	void nonStaticShow()
	{
		System.out.println("Value of a: "+ a);
		System.out.println("Value of b: "+ b);
	}
	static void staticShow()
	{
		System.out.println("Value of a: "+ a);
		System.out.println("Value of b: "+ b);		
	}
}
class StaticMethod
{
	public static void main(String[] arg)
	{
		Simple.staticShow();
	}
}
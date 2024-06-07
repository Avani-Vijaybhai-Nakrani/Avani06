package staticClass;

public class StaticDemo
{	
	int x = 10;
	public static void main(String[] args)
	{
		StaticDemo s1 = new StaticDemo();
		System.out.println(s1.x);
	}
	static
	{
		int x = 20;
		System.out.println(x+"");
	}
}

package staticExample;

public class Calculation
{
	
	static int count=0;
	int ct = 0;
	
	public Calculation()
	{
		count++;
		ct++;
	}
	
	public static void display()
	{
		System.out.println(count);
		System.out.println("I am Static Function");
	}
	
	@Override
	public String toString() {
		return " ct=" + ct +"\t"+
				"Count = "+count;
	}
	

}

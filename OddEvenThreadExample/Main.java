package OddEvenThreadExample;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		oddnumber o = new oddnumber();
		evennumber e = new evennumber();
		
		Thread thread1 = new Thread(o);
		Thread thread2 = new Thread(e);
	
		thread1.start();
		thread2.start();
		
		try
		{
			thread1.join();
			thread2.join();
		}
		
		catch(InterruptedException e1)
		{
			e1.printStackTrace();
		}
		
		System.out.println("Complete");

	}

}
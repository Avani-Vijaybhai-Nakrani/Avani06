package threadex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 th1 = new Thread1();
		th1.start();
		
		Thread2 th2 = new Thread2();
		Thread th = new Thread(th2);
		th.start();

	}

}

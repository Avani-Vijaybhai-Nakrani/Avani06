package interface_example;

public class Transaction implements Bank{

	@Override
	public void deposit(Account acc, int amt) {
		// TODO Auto-generated method stub
		
		int newbal = acc.getBalance()+amt;
		acc.setBalance(newbal);
		
		System.out.println("Balance deposited");

	}

	@Override
	public void withdraw(Account acc, int amt) {
		// TODO Auto-generated method stub
		int newbal = acc.getBalance()-amt;
		acc.setBalance(newbal);
		
		System.out.println("Balance updated");

	}

}

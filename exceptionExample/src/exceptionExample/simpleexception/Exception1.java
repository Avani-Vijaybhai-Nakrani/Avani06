package exceptionExample.simpleexception;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result;
		//a=12;
		//b=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("a : ");
		int a1 = sc.nextInt();
		System.out.print("b : ");
		int b1 = sc.nextInt();
		
		
		try 
		{
			result =a1/b1;
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("can Not be Divide"+e.getMessage());
		}

	}

}

package tnsif.newpackage.personalinfo;

import tnsif.newpackage.countryinfo.Country.Country;
import tnsif.newpackage.countryinfo.Country.State;

public class Person {
	
	private String Pname;
	private Country c1;
	private State s1;
	private int income;
	private int age;
	
	public Person() 
	{
		this.Pname = Pname;
		this.income = income;
		this.age=age;
	}
	public Person(String pname, int income, int age) 
	{
		Pname = pname;
		this.income = income;
		this.age = age;
	}
	public String getPname() {
		return Pname;
	}
	
	public void setPname(String pname) {
		Pname = pname;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [Pname=" + Pname + ", income=" + income + ", age=" + age + "]";
	}

}

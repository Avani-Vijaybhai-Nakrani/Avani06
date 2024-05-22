package tnsif.newpackage.personinfo;

import tnsif.newpackage.countryinfo.Country;
import tnsif.newpackage.countryinfo.State;

public class person {
	
	private String pname;
	private Country c1;
	private State s1;
	
	public person()
	{
		
	}
	
	public person(String pname, Country c1, State s1) {
		super();
		this.pname = pname;
		this.c1 = c1;
		this.s1 = s1;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Country getC1() {
		return c1;
	}

	public void setC1(Country c1) {
		this.c1 = c1;
	}

	public State getS1() {
		return s1;
	}

	public void setS1(State s1) {
		this.s1 = s1;
	}

	@Override
	public String toString() {
		return "person [pname=" + pname + ", c1=" + c1 + ", s1=" + s1 + "]";
	}
	
	
	
	
}
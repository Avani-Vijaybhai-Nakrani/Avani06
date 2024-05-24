package tnsif.newpackage.countryinfo.Country;

public class State {
	
	private String Sname;
	public State() {
		Sname = "Default";
	}
	public State(String sname) {

		Sname = sname;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	@Override
	public String toString() {
		return "State [Sname=" + Sname + "]";
	}

}

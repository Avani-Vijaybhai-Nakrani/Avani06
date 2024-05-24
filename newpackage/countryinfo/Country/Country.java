package tnsif.newpackage.countryinfo.Country;

public class Country {
	private String cname;

	public Country() {
		cname = "Default";
	}
	
	public Country(String cname) {
		this.cname = cname;
	}
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Country [cname=" + cname + "]";
	}
}

package tnsif.newpackage.personinfo;

import tnsif.newpackage.countryinfo.Country;
import tnsif.newpackage.countryinfo.State;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Country c = new Country("India");
			State s = new State("Gujarat");
			person p = new person("Avani",c,s);
			
			System.out.println(p);
	}

}

package DemoEmployee;

public class Employee {
	private String name,email;

	public String getEname()
	{
		return name;
	}
	
	public void setEname(String name)
	{
		this.name=name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}

	@Override
	public String toString() {
		return "Employee Details: \n "+
	            " Name : " + name + "\n"+""
	            		+ " Email : " + email + "";
	}
	
	

}

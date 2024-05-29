package hire_proj;

public class Manager extends Member{
	
	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Name = " + getName() + "Age = " + getAge() + "Phone number = " + getPhoneNumber() + 
				"Address = " + getAddress() + "Salary = " + getSalary() + "dept = " +dept;
	}
	


}

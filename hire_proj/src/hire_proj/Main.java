package hire_proj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		emp.setName("Avani");
		emp.setAge(22);
		emp.setPhoneNumber("9734576597");
		emp.setAddress("Ahmedabad");
		emp.setSalary(40000.00);
		emp.setSpecialization("Administrator");
		
		System.out.println(emp);

		Manager mng = new Manager();
		mng.setName("Avani");
		mng.setAge(22);
		mng.setPhoneNumber("9734576597");
		mng.setAddress("Ahmedabad");
		mng.setSalary(40000.00);
		mng.setDept("XYZ");
		
		System.out.println(mng);

	}

}

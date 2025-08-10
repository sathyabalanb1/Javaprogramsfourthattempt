package streamapiprograms;

public class Engineer {
	
	private int id;
	
	private String employeename;
	
	private int age;
	
	private String gender;
	
	private double salary;
	
	public Engineer(int id,String employeename,int age,String gender,double salary) {
		
		this.id=id;
		this.employeename=employeename;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}

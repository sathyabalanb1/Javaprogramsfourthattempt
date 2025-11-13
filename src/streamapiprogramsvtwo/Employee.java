package streamapiprogramsvtwo;

public class Employee {

	private String name;
	
	private double salary;
	
	private String gender;
	
	public Employee(String name, double salary,String gen) {
		this.name=name;
		this.salary=salary;
		this.gender=gen;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getGender() {
		return gender;
	}
	
	

}

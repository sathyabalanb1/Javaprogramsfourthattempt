package streamapiprograms;

import java.util.Arrays;
import java.util.List;

public class Femaleemployeecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee>employees = Arrays.asList(
				new Employee(1,"Sathya",31,"Male",50000.0),
				new Employee(2,"Vishali",25,"Female",50000.0),
				new Employee(3,"Shamly",26,"Female",55000.0),
				new Employee(3,"Nethra",23,"Female",67000.0),
				new Employee(3,"Prasanna",21,"Male",77000.0));
		
			femaleEmployeesCount(employees);
	}
	
	public static void femaleEmployeesCount (List<Employee>emps) {
	
		long femaleEmpCount = emps.stream().filter(e-> "Female".equalsIgnoreCase(e.getGender()))
											.count();
		
		System.out.println(femaleEmpCount);
		
		return;
				
	}

}

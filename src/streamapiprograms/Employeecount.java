package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employeecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee>employees = Arrays.asList(
				new Employee(1,"Sathya",31,"Male",50000.0),
				new Employee(2,"Vishali",25,"Female",50000.0),
				new Employee(3,"Shamly",26,"Female",55000.0),
				new Employee(3,"Nethra",23,"Female",67000.0),
				new Employee(3,"Prasanna",21,"Male",77000.0));
		
		employeeCount(employees);

	}
	
	public static void employeeCount (List<Employee>emps) {
		
		Map<String,Long>empCount = emps.stream()
									.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		System.out.println(empCount);
		
		return;
		
	}

}

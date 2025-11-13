package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employeeaveragesalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee>input = Arrays.asList(new Employee("sathya",46000,"Male"),
				new Employee("monisha",50000,"Female"),
				new Employee("divya",38000,"Female"),
				new Employee("vasanth",40000,"Male"),
				new Employee("rincy",48000,"Female")
				);
		
		employeeAverageSalary(input);

	}
	
	public static void employeeAverageSalary (List<Employee>emps) {
		
		Map<String,Double>output=emps.stream()
								.collect(Collectors.groupingBy(Employee::getGender,
										Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(output.get("Female"));
		System.out.println(output);
		
		return;
	}

}

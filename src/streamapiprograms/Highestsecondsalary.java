package streamapiprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Highestsecondsalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee>a = Arrays.asList(new Employee(1,"sathya",31,"Male",35000.0),
				new Employee(2,"gowtham",22,"Male",40000.0),
				new Employee(3,"rincy",30,"Female",53000.0),
				new Employee(4,"brewis",23,"Male",29000.0),
				new Employee(5,"prasanna",20,"Male",45000.0));
		
		highestSecondSalary(a);

	}
	
	public static void highestSecondSalary (List<Employee>input) {
		
		OptionalDouble secondHigh = input.stream()
				.mapToDouble(Employee::getSalary)
				.distinct()
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.mapToDouble(Double::doubleValue)
				.findFirst();
		
		secondHigh.ifPresentOrElse(System.out::println, ()->System.out.println("None"));
		
		return;
	}

}

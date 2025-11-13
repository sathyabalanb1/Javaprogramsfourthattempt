package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Secondhighestsalaryvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee>input = Arrays.asList(new Employee("sathya",46000,"Male"),
				new Employee("monisha",50000,"Female"),
				new Employee("divya",38000,"Female"),
				new Employee("vasanth",40000,"Male"),
				new Employee("rincy",48000,"Female")
				);
		
		secondHighestSalary(input);

	}
	
	public static void secondHighestSalary (List<Employee>emps) {
		
		OptionalDouble secondHigh = emps.stream().mapToDouble(Employee::getSalary)
		.distinct()
		.boxed()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.mapToDouble(Double::doubleValue)
		.findFirst();
		
		secondHigh.ifPresentOrElse(System.out::println, ()->System.out.println(secondHigh));
		
		return;
	}

}

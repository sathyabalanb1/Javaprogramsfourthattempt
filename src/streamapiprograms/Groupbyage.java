package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groupbyage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student>input = Arrays.asList(new Student(14,"hari"), 
				new Student(12,"kavin"),new Student(12,"pranav"));
		
		groupByAge(input);

	}
	
	public static void groupByAge (List<Student>students) {
		
		Map<Integer,List<Student>> elements = students.stream()
									.collect(Collectors.groupingBy(Student::getAge));
		
		System.out.println(elements);
		
		return;
	}

}

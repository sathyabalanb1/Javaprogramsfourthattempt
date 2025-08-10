package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Engineeraveragesalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Engineer>engs = Arrays.asList(
				new Engineer(1,"sathya",31,"Male",50000.0),
				new Engineer(1,"gracy",31,"Female",50000.0),
				new Engineer(1,"monisha",26,"Female",45000.0),
				new Engineer(1,"anto",24,"Male",55000.0),
				new Engineer(1,"suganya",28,"Female",40000.0));
		
		averageSalary(engs);

	}
	
	public static void averageSalary (List<Engineer>engineers) {
		
		Map<String,Double>avgSalary = engineers.stream()
											.collect(Collectors.groupingBy(Engineer::getGender,
													Collectors.averagingDouble(Engineer::getSalary)));
		
		System.out.println(avgSalary);
		
		return;
	}

}

package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Engineercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Engineer>engs = Arrays.asList(
						new Engineer(1,"sathya",31,"Male",50000.0),
						new Engineer(1,"gracy",31,"Female",60000.0),
						new Engineer(1,"monisha",26,"Female",45000.0),
						new Engineer(1,"anto",24,"Male",50000.0),
						new Engineer(1,"suganya",28,"Female",40000.0));
		
		engineerCount(engs);

	}
	
	public static void engineerCount(List<Engineer>engineers) {
		
		Map<String,Long>engCount = engineers.stream()
					.collect(Collectors.groupingBy(Engineer::getGender,Collectors.counting()));
		
		System.out.println(engCount);
		
		return;
	}

}

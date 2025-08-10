package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Developer>developers = Arrays.asList(
				new Developer("sathya",Arrays.asList("123","456","789")),
				new Developer("bala",Arrays.asList("321","654","987")));
		
		
		List<List<String>>mapResult=developers.stream()
				.map(Developer::getPhoneNumbers)
				.collect(Collectors.toList());
		
		System.out.println(mapResult);
		
		List<String>flatMapResult = developers.stream()
				.flatMap(phNumber->phNumber.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		
		System.out.println(flatMapResult);

	}

}

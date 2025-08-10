package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmapexamplebig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Developer>developers = Arrays.asList(
				new Developer("prajan",Arrays.asList("123","456","789")),
				new Developer("ranjan",Arrays.asList("986","1234","4387")));
		
		List<List<String>>mapResult = developers.stream()
				.map(Developer::getPhoneNumbers)
				.collect(Collectors.toList());
		
		System.out.println(mapResult);
		
		List<String>flatMapResult = developers.stream()
				.flatMap(developer->developer.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		
		System.out.println(flatMapResult);

	}

}

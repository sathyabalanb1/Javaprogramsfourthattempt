package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmapexamplevtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Developer>devs = Arrays.asList(
				new Developer("sathya",Arrays.asList("123","456")),
				new Developer("bala",Arrays.asList("555","666","222")),
				new Developer("monisha",Arrays.asList("888","111","555","333"))
				);
		
		flatMapExample(devs);

	}
	
	public static void flatMapExample (List<Developer>developer) {
		
		List<List<String>>mapResult=developer.stream()
			.map(Developer::getPhoneNumbers)
			.collect(Collectors.toList());
		
		System.out.println(mapResult);
		
		List<String>flatMapResult = developer.stream()
		.flatMap(dev->dev.getPhoneNumbers().stream())
		.collect(Collectors.toList());
		
		System.out.println(flatMapResult);
		
		return;
	}

}

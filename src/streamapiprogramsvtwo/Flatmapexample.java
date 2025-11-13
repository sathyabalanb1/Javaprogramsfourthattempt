package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Developer>devs = Arrays.asList(
				new Developer("sathya",Arrays.asList("123","456")),
				new Developer("bala",Arrays.asList("555","666","222")),
				new Developer("monisha",Arrays.asList("888","111","555","333"))
				);
		
		flatMapExample(devs);

	}
	
	public static void flatMapExample (List<Developer>developers) {
		
		List<List<String>>mapResult = developers.stream()
										.map(Developer::getPhoneNumbers)
										.collect(Collectors.toList());
		
		System.out.println(mapResult);
		
		List<String>flatMapResult = developers.stream()
				.flatMap(dev->dev.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		
		System.out.println(flatMapResult);
		
		return;
	}

}

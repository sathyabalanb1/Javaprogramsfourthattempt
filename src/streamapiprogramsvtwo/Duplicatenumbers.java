package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Duplicatenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>a = Arrays.asList(1,2,2,2,3,6,8,4,4,10,2,9,3,5,5,5,7,5);
		
		findDuplicateNumbers(a);

	}
	
	public static void findDuplicateNumbers (List<Integer>input) {
		
		List<Integer>output=input.stream()
		.collect(Collectors.groupingBy(e->e,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry->entry.getValue()>1)
		.map(Map.Entry::getKey)
		.collect(Collectors.toList());
		
		System.out.println(output);
		
		return;
	}

}

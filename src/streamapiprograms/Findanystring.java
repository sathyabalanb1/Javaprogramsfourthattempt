package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Findanystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>a = Arrays.asList("abinaya","bhavyatrika","Akshidha","Ananya","Kavithanchaly");
		
		List<String>b = Arrays.asList("abinaya","bhavyatrika","akshidha","ananya","kavithanchaly");
		
		findAnyString(a);
		findAnyString(b);

	}
	
	public static void findAnyString (List<String>input) {
		
		Optional<String>output = input.stream()
									.filter(word -> word.startsWith("A"))
									.findAny();
		
		output.ifPresentOrElse(System.out::println, ()->System.out.println("None"));
		
		return;
	}

}

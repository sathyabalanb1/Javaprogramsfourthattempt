package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Commaseparatedsinglestrinvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>a = Arrays.asList("sathya","monisha","srimathi","suganya","gracy");
		
		commaSeparatedString(a);

	}
	
	public static void commaSeparatedString (List<String>input) {
		
		String output = input.stream().collect(Collectors.joining(","));
		
		System.out.println(output);
		
		return;
	}

}

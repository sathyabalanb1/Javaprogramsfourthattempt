package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatmapillustrationvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1[]= {"monisha","srimathi","suganya"};
		
		flatMapIllustration(s1);

	}
	
	public static void flatMapIllustration (String input[]) {
		
		Stream<String>streamOfWords = Arrays.stream(input);
		
		Stream<String[]>streamOfLetters = streamOfWords.map(word -> word.split(""));
		
		List<String>output = streamOfLetters.flatMap(Arrays::stream).collect(Collectors.toList());
		
		System.out.println(output);
		
		return;
	}

}

package streamapiprogramsvthree;

import java.util.Arrays;
import java.util.stream.Stream;

public class Flatmapillustration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"sathya","balan"};
		
		flatMapIllustration(a);

	}
	
	public static void flatMapIllustration (String input[]) {
		
		Stream<String>streamOfWords = Arrays.stream(input);
		
		Stream<String[]>streamOfLetters = streamOfWords.map(word->word.split(""));
		
		streamOfLetters.flatMap(Arrays::stream).forEach(w->System.out.print(w+","));
		
		System.out.println();
		
		return;
	}

}

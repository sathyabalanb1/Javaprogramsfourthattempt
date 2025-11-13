package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.stream.Stream;

public class Flatmapillustration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1[] = {"sathya","bala"};
		
		flatMapIllustration(s1);

	}
	
	public static void flatMapIllustration (String input[]) {
		
		Stream<String>streamOfWords=Arrays.stream(input);
		
		Stream<String[]>streamOfLetters = streamOfWords.map(word->word.split(""));
		
		streamOfLetters.flatMap(Arrays::stream).forEach(w->System.out.print(w+","));
		
		System.out.println();
		
		return;
	}

}

package streamapiprograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class Flatmapexamplesmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arrayOfWords[] = {"sathya","bala"};
		Stream<String>streamOfWords = Arrays.stream(arrayOfWords);
		
		Stream<String[]>streamOfLetters = streamOfWords.map(word->word.split(""));
		streamOfLetters.flatMap(Arrays::stream).forEach((word)->System.out.println(word));

	}

}

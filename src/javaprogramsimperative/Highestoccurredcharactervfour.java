package javaprogramsimperative;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Highestoccurredcharactervfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		highestOccurredCharacter("aaaabcdeedlllklljlyzzzaly");
		highestOccurredCharacter("55587912333383511539");
		highestOccurredCharacter(null);
		highestOccurredCharacter("");
		highestOccurredCharacter("   ");
		highestOccurredCharacter("&%$#&&&###$%%");
		highestOccurredCharacter("abcdefhijkl");
		highestOccurredCharacter("A");

	}
	
	public static void highestOccurredCharacter (String str) {
		
		if(str==null || str.isEmpty() || str.isBlank()) {
			System.out.println("Invalid Input");
			return;
		}
		
		Map<Character,Integer>countMap = new LinkedHashMap<>();
		
		for(char c: str.toCharArray()) {
			countMap.put(c, countMap.getOrDefault(c, 0)+1);
		}
		
		int maxCount=0;
		char maxChar='\0';
		
		Set<Map.Entry<Character,Integer>>frequencySet = countMap.entrySet();
		
		for(Map.Entry<Character, Integer>entry: frequencySet) {
			if(entry.getValue()>maxCount) {
				maxCount=entry.getValue();
				maxChar=entry.getKey();
			}
		}
		
		System.out.println("Highest Occurred Character: "+maxChar);
		return;
	}

}

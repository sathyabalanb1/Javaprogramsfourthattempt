package javaprogramsimperative;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Highestoccurredcharactervtwo {

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
	
	public static void highestOccurredCharacter (String st) {
		
		if(st==null || st.isEmpty() || st.isBlank()) {
			System.out.println("Invalid Input");
			return;
		}
		
		Map<Character,Integer>countMap = new LinkedHashMap<>();
		
		for(char ch:st.toCharArray()) {
			countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
		}
		
		char maxChar='\0';
		int maxCount=0;
		
		Set<Map.Entry<Character,Integer>>frequencySet = countMap.entrySet();
		
		for(Map.Entry<Character, Integer>entry:frequencySet) {
			if(maxCount<entry.getValue()) {
				maxChar=entry.getKey();
				maxCount=entry.getValue();
			}
		}
		
		System.out.println("Max Occurred Char: "+maxChar+", "+"Count: "+maxCount);
		return;	
		
	}

}

package javaprogramsimperativevtwo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Firstnonrepeatedcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		firstNonRepeatedCharacter("sathyabalansth");
		firstNonRepeatedCharacter("112233445566778899");
		firstNonRepeatedCharacter("bavithrab");
		firstNonRepeatedCharacter("54321");
		firstNonRepeatedCharacter("");
		firstNonRepeatedCharacter(null);

	}
	
	public static void firstNonRepeatedCharacter (String str) {
		
		boolean nonRepeated=false;
		
		if(str==null || str.isEmpty() || str.isBlank()) {
			System.out.println("Invalid Input");
			return;
		}
		
		Map<Character, Integer> countMap = new LinkedHashMap<>();
		
		for(char c: str.toCharArray()) {
			countMap.put(c, countMap.getOrDefault(c, 0)+1);
		}
		
		Set<Map.Entry<Character,Integer>>frequencySet = countMap.entrySet();
		
		for(Map.Entry<Character, Integer>entry:frequencySet) {
			if(entry.getValue()==1) {
				nonRepeated=true;
				System.out.println("First Non Repeated Character: "+entry.getKey());
				return;
			}
		}
		
		if(!nonRepeated) {
			System.out.println("All characters in the String are repeated");
			return;
		}
		
		
	}

}

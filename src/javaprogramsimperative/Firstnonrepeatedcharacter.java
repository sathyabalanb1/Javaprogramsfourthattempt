package javaprogramsimperative;

import java.util.LinkedHashMap;
import java.util.Map;

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
	
	public static void firstNonRepeatedCharacter (String st) {
		
		if(st==null || st.isEmpty() || st.isBlank()) {
			System.out.println("Invalid Input");
			return;
		}
		
		Map<Character,Integer>countMap = new LinkedHashMap<>();
		
		int count;
		
		for(char ch:st.toCharArray()) {
			countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
		}
		
		for(char ch:st.toCharArray()) {
			count=countMap.get(ch);
			if(count==1) {
				System.out.println("First Non Repeated Character is: "+ch);
				return;
			}
		}
		
		System.out.println("All characters in the string are repeated");
		return;
	}

}

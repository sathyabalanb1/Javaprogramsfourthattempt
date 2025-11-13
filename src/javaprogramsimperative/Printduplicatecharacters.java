package javaprogramsimperative;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Printduplicatecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="abcaaalkkpqrstcdccwxyz";
		
		String s2=null;
		
		String s3="";
		
		String s4="abcdefghijklmnopqrstuvwxyz";
		
		printDuplicateCharacters(s1);
		
		printDuplicateCharacters(s2);
		
		printDuplicateCharacters(s3);
		
		printDuplicateCharacters(s4);

	}
	
	public static void printDuplicateCharacters (String str) {
		
		int nonUniqueCount=0,count;
		
		if(str==null || str.isEmpty()) {
			System.out.println("Input should not be empty or null");
			return;
		}
		
		Map<Character,Integer>frequencyMap=new LinkedHashMap<>();
		
		for(char ch:str.toCharArray()) {
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0)+1);
		}
		
		Set<Map.Entry<Character,Integer>>frequencySet = frequencyMap.entrySet();
		
		for(Map.Entry<Character, Integer>entry:frequencySet) {
			count=entry.getValue();
			
			if(count>1) {
				nonUniqueCount++;
				System.out.print(entry.getKey()+",");
			}
		}
		
		if(nonUniqueCount==0) {
			System.out.println("Input String is Unique");
			return;
		}
		System.out.println();
		return;
	}

}

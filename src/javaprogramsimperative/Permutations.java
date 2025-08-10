package javaprogramsimperative;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		generatePermutations("abc","");
		
		System.out.println("-------------");
		
		generatePermutations("1234","");
		
		System.out.println("----------------");
		
		generatePermutations("xyz","");

	}
	
	public static void generatePermutations (String str, String prefix) {
		
		if(str.isEmpty()) {
			System.out.println(prefix);
			return;
		}
		
		int i=0;
		
		String rem;
		
		while(i<str.length()) {
			rem = str.substring(0, i)+str.substring(i+1);
			generatePermutations(rem,prefix+str.charAt(i));
			i++;
		}
		
		return;
	}

}

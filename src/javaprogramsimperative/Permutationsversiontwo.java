package javaprogramsimperative;

public class Permutationsversiontwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		generatePermutations("abc","");
		
		System.out.println("-------------");
		
		generatePermutations("1234","");
		
		System.out.println("----------------");
		
		generatePermutations("xyz","");

	}
	
	public static void generatePermutations(String str, String prefix) {
		
		if(str.isEmpty()) {
			System.out.println(prefix);
			return;
		}
		
		int i=0;
		
		String remaining;
		
		while(i<str.length()) {
			remaining = str.substring(0, i) +str.substring(i+1);
			generatePermutations(remaining,prefix+str.charAt(i));
			i++;
		}
		
		return;
	}

}

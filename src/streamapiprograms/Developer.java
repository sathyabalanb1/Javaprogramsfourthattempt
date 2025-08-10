package streamapiprograms;

import java.util.List;

public class Developer {

	private String name;
	
	private List<String> phoneNumbers;
	
	public Developer(String name, List<String>phoneNumbers) {
		this.name=name;
		this.phoneNumbers=phoneNumbers;
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<String> getPhoneNumbers(){
		
		return this.phoneNumbers;
	}

}

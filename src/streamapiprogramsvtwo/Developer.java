package streamapiprogramsvtwo;

import java.util.List;

public class Developer {
	
	private String name;
	
	private List<String> phoneNumbers;
	
	public Developer(String nam, List<String>phNumbers) {
		this.name=nam;
		this.phoneNumbers=phNumbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
	

}

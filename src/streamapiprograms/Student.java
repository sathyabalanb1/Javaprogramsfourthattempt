package streamapiprograms;

public class Student {
	
	private int age;
	
	private String name;
	
	public Student (int a,String n) {
		
		this.age=a;
		this.name=n;
	}
	
	public void setAge (int age) {
		this.age=age;
	}
	
	public int getAge () {
		return this.age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		
		return "Student: "+"name= "+name+", "+"age= "+age;
	}

}

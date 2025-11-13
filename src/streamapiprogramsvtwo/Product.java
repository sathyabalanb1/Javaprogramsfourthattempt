package streamapiprogramsvtwo;

public class Product {
	
	private String name;
	
	private int price;
	
	public Product(String pname,int prodprice) {
		this.name=pname;
		this.price=prodprice;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String toString() {
		return "Name: "+this.name+", "+"Price: "+this.price;
	}
	
	

}

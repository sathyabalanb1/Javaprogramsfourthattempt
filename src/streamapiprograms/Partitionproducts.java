package streamapiprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitionproducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product>products = Arrays.asList(
				new Product("samsung",20000),
				new Product("mi",120000),
				new Product("realme",14000),
				new Product("apple",50000),
				new Product("oneplus",19000));
		
		partitionProducts(products);
		

	}
	
	public static void partitionProducts (List<Product>products) {
		
		Map<Boolean,List<Product>>output = products.stream()
										.collect(Collectors.partitioningBy(prod -> prod.getPrice()>15000));
		
		System.out.println("List of products partitioned by prices is: "+output);
		
		return;
	}

}

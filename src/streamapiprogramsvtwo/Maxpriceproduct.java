package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Maxpriceproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product>prodList = Arrays.asList(new Product("nokia",1100),
				new Product("lava",900), new Product("samsung",1500),
				new Product("karbonn",850),new Product("mi",2300));
		
		maxPriceProduct(prodList);

	}
	
	public static void maxPriceProduct (List<Product>prods) {
		
		String output = prods.stream()
						.collect(
						Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparing(Product::getPrice)), 
						(Optional<Product>prod)->prod.isPresent()?prod.get().getName():"None"));
		
		System.out.println(output);
		
		return;
	}

}

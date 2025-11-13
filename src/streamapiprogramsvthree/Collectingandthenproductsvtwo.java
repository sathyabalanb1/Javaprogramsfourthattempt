package streamapiprogramsvthree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import streamapiprogramsvtwo.Product;

public class Collectingandthenproductsvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product>prodList = Arrays.asList(new Product("nokia",1100),
				new Product("lava",900), new Product("samsung",1500),
				new Product("karbonn",850),new Product("mi",2300));
		
		collectingAndThenProduct(prodList);

	}
	
	public static void collectingAndThenProduct (List<Product>prods) {
		
		String maxPriceProduct = prods.stream().
					collect(Collectors.collectingAndThen
					(Collectors.maxBy(Comparator.comparing(Product::getPrice)), 
					(Optional<Product>prod)->prod.isPresent()?prod.get().getName():"None"));
		
		System.out.println(maxPriceProduct);
		
		return;
	}

}

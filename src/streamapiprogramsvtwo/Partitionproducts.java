package streamapiprogramsvtwo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitionproducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product>prodList = Arrays.asList(new Product("nokia",1100),
				new Product("lava",900), new Product("samsung",1500),
				new Product("karbonn",850),new Product("mi",2300));
		
		partitionProducts(prodList);

	}

	public static void partitionProducts (List<Product>products) {

		Map<Boolean,List<Product>>output =	products.stream().
				collect(Collectors.partitioningBy(prod->prod.getPrice()>1000));

		System.out.println(output);
		return;
	}

}

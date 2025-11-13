package streamapiprogramsvtwo;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Maxpriceproductvtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void maxPriceProduct (List<Product>prods) {
		
		prods.stream().
			 collect(Collectors.collectingAndThen
			 (Collectors.maxBy(Comparator.comparing(Product::getPrice)), 
			 (Optional<Product>prod)->prod.isPresent()?prod.get().getName():"None"));
	}

}

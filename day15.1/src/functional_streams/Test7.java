package functional_streams;

import static com.shop.utils.ShopUtils.*;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;
import com.shop.custom_exceptions.ProductHandlingException;

public class Test7 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			/*
			 * Display name of the least expensive product from specified category
			 */
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("All products -");
			productMap.forEach((k,v) -> System.out.println(v));
			System.out.println("Enter category name ");
			Category chosenCategory=Category.valueOf(sc.next().toUpperCase());
	//		System.out.println("Name of least expensive product");
		Comparator<Product> priceComparator=(p1,p2) -> Double.compare(p1.getPrice(), p2.getPrice());
			Optional<Product> optional=productMap.values() 
			.stream() 
			.filter(p -> p.getProductCategory()==chosenCategory)
			.min(priceComparator);
//			if(optional.isPresent())
//				System.out.println(optional.get().getName());
//			else
//				System.out.println("No Product!!!!!!!!!!!");
//			Product foundProduct = optional.orElse(new Product());
//			System.out.println(foundProduct);
//			optional.ifPresent(p -> System.out.println("Name of least expensive product "+p.getName()));
			/*orElseThrow(Supplier<? extends Throwable> excSupplier
			 * Supplier<T> - functional interface
			 * SAM - T get()
			 */
			Product product = optional.orElseThrow(() -> new ProductHandlingException("No product found under specified category"));
			System.out.println(product);
		
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());//No product found under specified category
		}

	}

}

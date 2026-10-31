package functional_streams;

import static com.shop.utils.ShopUtils.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test8 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			/*
			 * Collect products from Map(product map) with price < max price into
 another list & display list contents later
			 */
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("All products -");
			productMap.forEach((k,v) -> System.out.println(v));
			System.out.println("Enter max price ");
			double maxPrice=sc.nextDouble();
			List<Product> products=productMap.values() 
			.stream()
			.filter(p -> p.getPrice()< maxPrice)
			.toList();
			System.out.println("Product List with prices < "+maxPrice);
			products.forEach(p -> System.out.println(p));
			System.out.println(products.getClass());
			//products.remove(0);
		
		}

	}

}

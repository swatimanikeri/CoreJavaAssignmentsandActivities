package functional_streams;

import static com.shop.utils.ShopUtils.*;

import java.util.Map;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test4 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			/*
			 * Display all the products from Map with specified category & price > min price
			 * 
			 */
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("Enter category name &  min price");
			Category chosenCategory=Category.valueOf(sc.next().toUpperCase());
			double minPrice=sc.nextDouble();
			
			System.out.println("Selected products ");
			//impertive style
			productMap.values() //Collection<Product> //convert to coll
			.stream() // Stream<Product> - all products
			.filter(p -> p.getProductCategory() == chosenCategory)
			.filter(p -> p.getPrice()> minPrice)
			.forEach(p -> System.out.println(p));
		}

	}

}

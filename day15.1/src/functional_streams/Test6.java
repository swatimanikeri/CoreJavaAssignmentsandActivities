package functional_streams;

import static com.shop.utils.ShopUtils.*;

import java.util.Map;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test6 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			/*
			 * Display sum of prices of all the products in a map from the specified category

			 */
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("All products -");
			//BiConsumer<>
			productMap.forEach((k,v) -> System.out.println(v));
			
			System.out.println("Enter category name ");
			Category chosenCategory=Category.valueOf(sc.next().toUpperCase());
			System.out.println("Sum of price of Selected products ");
			System.out.println("Sum "+
			productMap.values() 
			.stream() 
			.filter(p -> p.getProductCategory()==chosenCategory)
			//
			.mapToDouble(p-> p.getPrice())// DoubleStream
			.sum());
		
		}

	}

}

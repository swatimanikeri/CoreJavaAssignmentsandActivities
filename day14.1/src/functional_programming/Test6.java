package functional_programming;

import java.util.Collections;
import java.util.List;

import com.shop.core.Product;
import com.shop.utils.ShopUtils;

public class Test6 {

	public static void main(String[] args) {
		
			List<Product> productList = ShopUtils.populateProductList();			
			System.out.println("All products - ");
			productList.forEach(p -> System.out.println(p));
			/*
			 * Display Sorted  products as per price 
			 * - custom ordering (Comparator : compare)
			 */
		//	Collections.sort(productList,ano innner class imple Comparator);
			//productList.sort(comp);
			/*
			 * Comparator
			 * public int compare(T o1,T o2)
			 */
			//instead use FP - lambda expression
			productList.sort((p1,p2) -> Double.compare(p1.getPrice(),p2.getPrice()));
			System.out.println("Sorted products as per price ");
			productList.forEach(p -> System.out.println(p));
	}

}

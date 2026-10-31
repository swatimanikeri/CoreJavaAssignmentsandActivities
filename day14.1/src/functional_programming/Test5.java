package functional_programming;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;
import static com.shop.utils.ShopUtils.*;

public class Test5 {

	public static void main(String[] args) {
		
			/*
			 * Get Product Map from ShopUtils 
			 * display the map
			 */
			 Map<Integer, Product> productMap = populateProductMap(populateProductList());
			 System.out.println("All products from the Map");
//			 productMap.forEach((pid,product) -> System.out.println(pid+" : "+product));
			 productMap.forEach((pid,product) -> System.out.println(product));
			
		
			
			
		
	}

}

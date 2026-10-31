package functional_programming;

import java.util.List;
import java.util.Locale.Category;

import com.shop.core.Product;
import com.shop.utils.ShopUtils;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * Get Product List from ShopUtils
		 * Display the products (forEach)
		 */
		List<Product> productList = ShopUtils.populateProductList();
		System.out.println("All products - ");
		// Display the products (forEach)
		productList.forEach(p -> System.out.println(p));
		double increment=10;
		//increment all product prices by 10 & display the list again
		productList.forEach(prod -> prod.setPrice(prod.getPrice()+increment));
		System.out.println("All products - after increment ");
		productList.forEach(p -> System.out.println(p));
//Remove all products of specific category ,from product list
		//cat name imperative 
//		for(Product p:productList) {
//			Category cat=Category.valueOf(catName);
//			if(p.getCategory==cat) {
//				productList.remove(p);//RE 
//			}
//		}
		//itr declare karana ,itr chi remove method call kara ok
		//
		
		//public default boolean remove()
		//itr.remove karata hai internally(java takes care )
		//better Approrch is FP
		//public default boolean removeIf(Predicate<? super E> filter)
		//it removes all the elem from the underlying coll if the filter cond is satisfied
		//returns true if elem is removed
		//
		productList.removeIf(p->p.getProductCategory()==cat);
		
		
		
	}

}

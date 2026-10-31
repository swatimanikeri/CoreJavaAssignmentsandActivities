package functional_streams;

import static com.shop.utils.ShopUtils.populateProductList;

import java.util.List;

import com.shop.core.Product;

public class Test2 {

	public static void main(String[] args) {
		// 1. get product list from utils
		List<Product> productList = populateProductList();
		/*
		 * Get product list , attach stream , 
		 * display its contents 
		 * Sequential access
		 * Parallel access
		 * 
		 */
		System.out.println("Sequentially accessed ");
		productList.stream() //Stream<Product>
		.forEach(p -> System.out.println(p));//terminal operation
		
		System.out.println("Parallel  accessed ");
		productList.parallelStream() //Stream<Product> - multiple threads will be used by JVM to perform further ops
		.forEach(p -> System.out.println(p));//terminal operation
		
		System.out.println("Parallel  accessed  - but ordered");
		productList.parallelStream() //Stream<Product> - multiple threads will be used by JVM to perform further ops
		.forEachOrdered(p -> System.out.println(p));//terminal operation
		

		
	

	}

}

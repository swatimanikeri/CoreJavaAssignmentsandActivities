package tester;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Product;
import com.shop.utils.ShopUtils;
import static com.shop.utils.ShopUtils.*;

public class StoreProductDetails {

	public static void main(String[] args) {
		System.out.println("Enter file name to store product details");
		try (Scanner sc = new Scanner(System.in);
				// Java App ---> OOS (serializer- serliazation =converting state of Java objects
				// -> binary , state - non static & non transient data members) FileOutputStream
				// ---> Bin File)
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(sc.nextLine()))) {
			// get populated product map
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			out.writeObject(productMap);
			System.out.println("serialization done...");
		} //out.close -> sc.close
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

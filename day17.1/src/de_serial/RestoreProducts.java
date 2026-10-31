package de_serial;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class RestoreProducts {

	public static void main(String[] args) {
		System.out.println("Enter bin file name to restore the products");
		try (// sc
				Scanner sc = new Scanner(System.in);
				// Java App <---- OIS(InputStream inputstream) <----- FIS <----bin file (.ser)
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(sc.nextLine()))) {
			//de ser
			Object map=in.readObject();
			System.out.println(map);//{k1=v1,k2=v2.....}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/*
 * 	Prompt user for file name
Read data from the text file using buffer , till EOF , print it on the console.
Handle exceptions properly

 */

public class TestBufferedFileReadFP {

	public static void main(String[] args) {
		System.out.println("Enter file name - to read data");
		try(//sc
				Scanner sc=new Scanner(System.in);
				//Java App   <------  BufferedReader(Reader r)<------  FileReader(fileName)<------Text File
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()));
				
				) {
			
			 System.out.println("Text file contents uppercased with length filter - ");
			br.lines() //Stream<String>
			.filter(s -> s.length()>10)
			.map(s -> s.toUpperCase())
			.forEach(line -> System.out.println(line));
		} //JVM -  closes FileReader -> BufferedReader-> SCanner
		
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over !");

	}

}

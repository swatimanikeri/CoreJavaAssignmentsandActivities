package file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/*
 * 	Prompt user for file name
Read data from the text file using buffer , till EOF , print it on the console.
Handle exceptions properly

 */

public class TestBufferedFileRead {

	public static void main(String[] args) {
		System.out.println("Enter file name - to read data");
		try(//sc
				Scanner sc=new Scanner(System.in);
				//Java App   <------  BufferedReader(Reader r)<------  FileReader(fileName)<------Text File
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()));
				
				) {
			 String line=null;
			 System.out.println("Text file contents - ");
			 while((line=br.readLine())!= null) {
				 System.out.println(line);
			 }
		} //JVM -  closes filereader -> br -> sc.
		
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over !");

	}

}

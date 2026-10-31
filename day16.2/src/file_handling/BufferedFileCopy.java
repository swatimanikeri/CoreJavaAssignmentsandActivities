package file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedFileCopy {

	public static void main(String[] args) {
		System.out.println("Enter src & dest file names on separate lines");
		try(Scanner sc=new Scanner(System.in);
				//Java App <--- BR <---- FR <--- TextFile
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()));
				//Java App ---> PW ---> FW   -> Text File
				PrintWriter pw=new PrintWriter(new FileWriter(sc.nextLine(),true))
				) {
			System.out.println("copying contents");
//			br.lines() //Stream<String> - line
//			.forEach(System.out::println);//s -> sop(s)
			br.lines() //Stream<String> - line
			.forEach(pw::println);//line -> pw.println(line)
			
		} //pw.close (sends buffer contents to FW -> close) , br , sc.close
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

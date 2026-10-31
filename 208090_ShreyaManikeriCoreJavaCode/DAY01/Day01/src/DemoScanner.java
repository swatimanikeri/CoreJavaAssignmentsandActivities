
import java.util.*;

class MenuDrivernProgram{
public static void main(String[] args){

Scanner scanner=new Scanner(System.in);
System.out.println("\n0.Generate Bill\n1.Dosa\n2.Samosa\n3.Idli\n");
System.out.println("Enter the choice: ");
int c=sc.nextInt();
double totalBill=0;
double dosaPrice=70.0;
double samosaPrice=30;
double idliPrice=50;
int qty;
boolean exit=false;
while(!exit){

case 1:
     System.out.println("you choose dosa and enter quantity: ");
     qty=sc.nextInt();
     totalBill=dosaPrice*qty;
     System.out.println("Total Bill: "+totalBill);
     break;

case 2:
     System.out.println("you choose Samosa and enter quantity: ");
     qty=sc.nextInt();
     totalBill=samosaPrice*qty;
       System.out.println("Total Bill: "+totalBill);
     break;

case 3:
     System.out.println("you choose dosa and enter quantity: ");
     qty=sc.nextInt();
     totalBill=dosaPrice*qty;
     System.out.println("Total Bill: "+totalBill);
     break;

}

scanner.close();
}}












4.1 Write Java program - 
Display food menu to user. User will select items from menu along with the quantity. 
(eg 1. Dosa 2. Samosa 3. Idli ... 0 . Generate Bill ) 
Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option(0) , display total bill & exit.

OR
Write Java program for the following - 
It should  run till user enters any other option than add or sub or multiply or divide
Prompt user to enter the input operation : (add|subtract|multiply|divide) & 2 numbers(double)
Display the result of the operation.
Use Scanner for accepting all inputs from user. 
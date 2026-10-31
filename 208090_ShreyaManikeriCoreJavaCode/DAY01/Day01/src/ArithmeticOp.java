import java.util.*;
class ArithmeticOp{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);

int num1;
int num2;
System.out.println("Enter two numbers: ");
num1=sc.nextInt();
num2=sc.nextInt();
System.out.println("1.add\n2.subtract\n3.multiply\n4.divide\n5.exit");
boolean exit=false;
while(!exit){
System.out.println("Enter your choice: ");
switch(sc.next()){
case "add":
	System.out.println("Addition: "+ (num1+num2));
	break;
case "substract":
	System.out.println("Substraction: "+ (num1*num2));
	break;
case "multiply":
	System.out.println("Multiplication: " +(num1-num2));
	break;
case "divide":
       if(num2!=0)
	System.out.println("Division:"+ (num1/num2));
       else 
	System.out.println("Division by 0 NOT ALLOWED");
	break;
case "exit" :
	System.out.println("we are exiting..Thank you");
         exit=true;
	break;
default:
	System.out.println("You entered wrong option ...we are exiting..Thank you");
         exit=true;
	break;
}}
sc.close();
}
}
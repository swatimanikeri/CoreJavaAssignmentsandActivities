import java.util.Scanner;
class FoodMenu{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
boolean exit=false;
int totalBill=0;

int dosaPrice=80;
int samosaPrice=30;
int idliPrice=50;

int qty;
while(!exit){
System.out.println("0.Display Bill\n1.Dosa\n2.Samosa\n3.Idli\n");
int choice;

System.out.println("Enter the choice: ");
choice=sc.nextInt();
switch(choice){
case 0:
        System.out.println("Your Total Bill : "+totalBill);
        exit =true;
         break;
case 1:System.out.println("you choose dosa and enter the quantity:  ");
       qty=sc.nextInt();
       totalBill+=qty*dosaPrice;
       break;
case 2:System.out.println("you choose Samosa and enter the quantity:  ");
       qty=sc.nextInt();
       totalBill+=qty*samosaPrice;
       break;
case 3:System.out.println("you choose Idli and enter the quantity:  ");
       qty=sc.nextInt();
       totalBill+=qty*idliPrice;
       break;
default:System.out.println("you entered invalid option.we are exiting ..Thank you.");
       exit=true;
       break;
} }
sc.close();
}

}
import java.util.Scanner;

class FoodMenu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Item Prices
        final int DOSA_PRICE = 80;
        final int SAMOSA_PRICE = 30;
        final int IDLI_PRICE = 50;
        
        // Track Quantities Ordered (For an itemized receipt)
        int dosaQty = 0;
        int samosaQty = 0;
        int idliQty = 0;
        
        int totalBill = 0;
        int choice;
        int currentQty;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Dosa   (Rs. 80)");
            System.out.println("2. Samosa (Rs. 30)");
            System.out.println("3. Idli   (Rs. 50)");
            System.out.println("4. Generate Bill & Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity for Dosa: ");
                    currentQty = sc.nextInt();
                    dosaQty += currentQty;
                    totalBill += currentQty * DOSA_PRICE;
                    break;
                    
                case 2:
                    System.out.print("Enter quantity for Samosa: ");
                    currentQty = sc.nextInt();
                    samosaQty += currentQty;
                    totalBill += currentQty * SAMOSA_PRICE;
                    break;
                    
                case 3:
                    System.out.print("Enter quantity for Idli: ");
                    currentQty = sc.nextInt();
                    idliQty += currentQty;
                    totalBill += currentQty * IDLI_PRICE;
                    break;
                    
                case 4:
                    // Print final itemized summary before exiting
                    System.out.println("\n====== FINAL BILL ======");
                    if (dosaQty > 0) System.out.println("Dosa x " + dosaQty + " = Rs. " + (dosaQty * DOSA_PRICE));
                    if (samosaQty > 0) System.out.println("Samosa x " + samosaQty + " = Rs. " + (samosaQty * SAMOSA_PRICE));
                    if (idliQty > 0) System.out.println("Idli x " + idliQty + " = Rs. " + (idliQty * IDLI_PRICE));
                    System.out.println("------------------------");
                    System.out.println("Total Amount Payable: Rs. " + totalBill);
                    System.out.println("========================");
                    System.out.println("Thank you for dining with us!");
                    exit = true; // Loop ends here cleanly
                    break;
                    
                default:
                    // Invalid input shouldn't break the application, just notify the user
                    System.out.println("Invalid choice! Please select an option between 1 and 4.");
                    break;
            }
        }
        sc.close();
    }
}

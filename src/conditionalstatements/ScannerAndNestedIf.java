package conditionalstatements;

import java.util.Scanner;

public class ScannerAndNestedIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have a credit card");
        String creditCard = scan.next();

        if (creditCard.equalsIgnoreCase("yes")){
            System.out.println("What is the balance on your credit card");

            double balance = scan.nextDouble();
            if (balance>1000){
                System.out.println("Please pay off your balance immediatly");
            }else {
                System.out.println("You are in a good standing");
            }

        } else if (creditCard.equalsIgnoreCase("no")) {
            System.out.println("Would you like to apply to get one");
        }else {
            System.out.println("Invalid input");
        }


    }
}
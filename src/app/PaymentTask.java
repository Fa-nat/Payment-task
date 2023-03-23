package app;

import java.util.Scanner;

// 1.used switch case
public class PaymentTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double purchaseAmount = 233.00; // сумма покупки
        System.out.println("Purchase amount: " + purchaseAmount + " USD");

        System.out.println("Select a Payment Method: ");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. Pay the bill");
        int paymentMethod = scanner.nextInt();

        double commission = 0.0;
        switch (paymentMethod) {
            case 1:
                System.out.println("You have chosen to pay in cash.");
                break;
            case 2:
                System.out.println("You have chosen to pay by card.");
                commission = purchaseAmount * 0.02;
                break;
            case 3:
                System.out.println("You have chosen to pay by invoice");
                commission = purchaseAmount * 0.05;
                break;
            default:
                System.out.println("Error! Choose a payment method from 1 to 3.");
                return;

        }

        double totalAmount = purchaseAmount + commission;
        System.out.println("Commission amount: " + commission + " USD");
        System.out.println("Total payable:" + totalAmount + " USD");
    }

    // 2.used if/else case
    public class paymentTask2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double purchaseAmount = 233.00; // сумма покупки
            System.out.println("Purchase amount: " + purchaseAmount + " USD");

            System.out.println("Select a Payment Method: ");
            System.out.println("1. Cash");
            System.out.println("2. Card");
            System.out.println("3. Pay the bill");
            int paymentMethod = scanner.nextInt();

            double commission = 0.0;
            if (paymentMethod == 1) {
                System.out.println("You have chosen to pay in cash.");
            } else if (paymentMethod == 2) {
                System.out.println("You have chosen to pay by card.");
                commission = purchaseAmount * 0.02;
            } else if (paymentMethod == 3) {
                System.out.println("You have chosen to pay by invoice");
                commission = purchaseAmount * 0.05;
            } else {
                System.out.println("Error! Choose a payment method from 1 to 3.");
                return;
            }

            double totalAmount = purchaseAmount + commission;
            System.out.println("Commission amount: " + commission + " USD");
            System.out.println("Total payable:" + totalAmount + " USD");
        }
    }

}




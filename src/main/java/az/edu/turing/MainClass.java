package az.edu.turing;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        AtmOperationInterface op = new AtmOperationImpl();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------Welcome to ATM Machine!!!---------------------------- ");
        System.out.print("Enter Atm Number: ");
        int atmNumber = scanner.nextInt();
        System.out.print("Enter Pin: ");
        int pin = scanner.nextInt();
        if ((atmnumber == atmNumber) && (atmpin == pin)) {

            while (true) {
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini statement\n5.Exit");
                System.out.println("Enter Choice:");
                int ch = scanner.nextInt();
                if (ch == 1) {
                    op.viewBalance();

                } else if (ch == 2) {
                    System.out.println("Enter amount to WithDraw:");
                    double withdrawAmount = scanner.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                } else if (ch == 3) {
                    System.out.println("Enter Amount to Deposit : ");
                    double depositAmount = scanner.nextDouble();
                    op.depositAmount(depositAmount);
                } else if (ch == 4) {
                    op.viewMiniStatement();
                } else if (ch == 5) {
                    System.out.println("Collect your ATM card!\n Thank you for using ATM Machine :)");
                    System.exit(0);
                } else {
                    System.out.println("Please enter correct choice!");
                }
            }
        } else if (atmnumber != atmNumber) {
            System.out.println("Incorrect Atm Number!");
            System.exit(0);
        } else {
            System.out.println("Incorrect Atm pin!");
            System.exit(0);
        }
    }
}

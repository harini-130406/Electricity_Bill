
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units consumed: ");
        double units = sc.nextDouble();

        double bill;

        if (units < 0) {
            System.out.println("Invalid units!");
            sc.close();
            return;
        }

        if (units <= 100) {
            bill = units * 1.50;
        } else if (units <= 200) {
            bill = (100 * 1.50)
                    + ((units - 100) * 2.50);
        } else {
            bill = (100 * 1.50)
                    + (100 * 2.50)
                    + ((units - 200) * 4.00);
        }

        System.out.println("Electricity Bill: Rs. " + bill);

        sc.close();
    }
}

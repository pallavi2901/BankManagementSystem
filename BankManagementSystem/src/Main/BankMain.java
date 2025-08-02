/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author K.pallavi
 */

import Controller.BankController;
import Model.Customer;
import View.BankView;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        BankView view = new BankView();
        BankController controller = new BankController(view);
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\nBank Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. View All Customers");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double bal = scanner.nextDouble();
                    controller.addCustomer(new Customer(id, name, bal));
                    break;
                case 2:
                    controller.showAllCustomers();
                    break;
                case 3:
                    System.out.print("Enter Customer ID: ");
                    int did = scanner.nextInt();
                    System.out.print("Enter Amount to Deposit: ");
                    double dAmt = scanner.nextDouble();
                    controller.deposit(did, dAmt);
                    break;
                case 4:
                    System.out.print("Enter Customer ID: ");
                    int wid = scanner.nextInt();
                    System.out.print("Enter Amount to Withdraw: ");
                    double wAmt = scanner.nextDouble();
                    controller.withdraw(wid, wAmt);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author K.pallavi
 */
import Model.Customer;
import java.util.List;

public class BankView {
    public void showCustomer(Customer c) {
        System.out.println(c.toString());
    }

    public void showAllCustomers(List<Customer> list) {
        if (list.isEmpty()) {
            System.out.println("No customers available.");
        } else {
            for (Customer c : list) {
                showCustomer(c);
            }
        }
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}

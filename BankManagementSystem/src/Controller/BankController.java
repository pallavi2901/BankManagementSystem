/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author K.pallavi
 */
import Model.Customer;
import View.BankView;

import java.util.ArrayList;
import java.util.List;

public class BankController {
    private List<Customer> customers;
    private BankView view;

    public BankController(BankView view) {
        this.view = view;
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer c) {
        customers.add(c);
        view.showMessage("Customer added.");
    }

    public void showAllCustomers() {
        view.showAllCustomers(customers);
    }

    public Customer getCustomerById(int id) {
        for (Customer c : customers) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public void deposit(int id, double amount) {
        Customer c = getCustomerById(id);
        if (c != null) {
            c.deposit(amount);
            view.showMessage("Deposit successful.");
        } else {
            view.showMessage("Customer not found.");
        }
    }

    public void withdraw(int id, double amount) {
        Customer c = getCustomerById(id);
        if (c != null) {
            if (c.withdraw(amount)) {
                view.showMessage("Withdrawal successful.");
            } else {
                view.showMessage("Insufficient balance.");
            }
        } else {
            view.showMessage("Customer not found.");
        }
    }
}

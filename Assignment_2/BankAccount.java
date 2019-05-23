
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aj132
 */
public class BankAccount {
    private String strName;
    private int id;
    private char accountType;
    private double Balance = 0;
    
    public BankAccount() {
        //something
        strName = "empty";
        id = 100;
        accountType = 'C';
        Balance = 0.0;
    }
    
    public BankAccount(String name, int ID, char account, double balance) {
        strName = name;
        id = ID;
        accountType = account;
        Balance = balance;
    }
    
    public String getName() {
        return strName;
    }
    
    public int getID() {
        return id;
    }
    
    public char getAccountType() {
        return accountType;
    }
    
    public double getBalance() {
        return Balance;
    }
    
    public void setName(String name) {
        strName = name;
    }
    
    public void setID(int ID) {
        id = ID;
    }
    
    public void setAccountType(char account) {
        accountType = account;
    }
    
    public void setBalance(double amount) {
        Balance = amount;
    }
    
    //new
    public void deposit(double amount) {
        Balance += amount;
    }
    
    //new
    public void withdraw(double amount) {
        Balance -= amount;
    }
    
    public void displayBalance() {
        JOptionPane.showMessageDialog ( null, "$"+ Balance , "Balance", JOptionPane.PLAIN_MESSAGE);
    }
}

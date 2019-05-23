/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aj132
 */
public class SavingAccount extends BankAccount {
    private double rate;
    
    public SavingAccount() {
        super();
        rate = 0;
    }
    
    public SavingAccount(double Rate, String name, int id, double balance ,char account) {
        super(name,id,account,balance);
        rate = Rate;
    }
    
    public SavingAccount(SavingAccount obj){
        super(obj.getName(),obj.getID(),obj.getAccountType(),obj.getBalance());
        rate = obj.rate;
    }
    
    public void addInterest() {
        //something
        this.deposit(this.getBalance()*rate);
    }
    
    public void deductLoan(double amount) {
        //something
        this.withdraw(amount);
    }
    
    //new
    public double myBalance(){
        return this.getBalance();
    }
    
    //new
    public boolean isSavings(){
        boolean isS = false;
        
        if(this.getAccountType() == 'S'){
            isS = true;
        }
        
        return isS;
    }
    
    public void displayAll(){
        
    }
    
    //new
    public String allAccountInformation(){
        String displayString = "";
        if(this.getAccountType() == 'S'){
            displayString += "Savings      ";
        }
        else{
            displayString += "Checking      ";
        }
        
        displayString += this.getName() + "      ";
        displayString += this.getID() + "      ";
        displayString += "$" + this.getBalance() + "      ";
        displayString += (rate * 100) + "%\n";
        
        return displayString;
    }
    
    //return a string of all that shit
    
}

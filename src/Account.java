import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private double balance;
    private Customer customer;
    
    public Account(double balance, String firstName, String lastName, String street, String city, String state, String zip){
        this.balance = balance;
        customer = new Customer(firstName, lastName, street, city, state, zip);
    }

    public double getBalance(){
        return (balance);
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdrawal(double amount){
        if(amount <= this.balance){
            this.balance -= amount;
        }else{
            System.out.println("Not enough money in account.");
        }
    }

    public String toString(){
        String accountString;
        NumberFormat money = NumberFormat.getCurrencyInstance(Locale.CANADA);

        accountString = this.customer.toString();
        accountString += "Customer balance is: " + money.format(this.balance);
        return (accountString);
    }
}

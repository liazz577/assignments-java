package BankAccount;

public class Account {
    String id;
    String name;
    double balance; // double balance

    public Account(String id, String name, double initialBalance) {
        this.id = id;
        this.name = name;
        this.balance = initialBalance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double initialBalance) {
        this.balance = initialBalance;
    }

    public void credit(int amount)	// note "mutator" method
    {
        //if (amount <= 0) return;
        // balance += amount;
        if ( amount >0) {
            double newBalance = balance + amount;
            balance = newBalance;
            System.out.println("Balance after deposit: " + balance);
        } else {
            System.out.println("Invalid amount ! Please input a number greater than 0 !");
        }
    }

    public void debit(int amount) {
        //if (amount <= 0 || amount > balance) return false;
        //balance -= amount;
        System.out.println("Enter the amount you want to pay: ");
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Balance after paying: " + balance);
        } else {
            System.out.println("Your balance is less than " + amount + "\tTransaction failed... !!" );
        }
    }
    //transfer from 1 account to destination account
    public void transferFunds(Account destination, int amount)
    {
        //if(amount <= 0 || amount > balance) return false;
        //destination.balance += amount;
        //balance -= amount;
        if (balance >= amount && amount >0) {
            this.balance = this.balance - amount;
            System.out.println("Balance of account " + this.getId() + " after transfer: " + this.balance);
        } else {
            System.out.println("Your balance is less than " + amount + " or below 0" + "\tTransaction failed... !!" );
        }
        if (amount > 0){
        destination.balance = destination.balance + amount;
        System.out.println("Balance of account " + destination.getId() + " after having received transfer: " + destination.balance);
        }else {
            System.out.println("\tTransaction failed... money hasn't been received !!" );
        }
    }

}






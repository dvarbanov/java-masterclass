package Section6.BankAccountConstructor;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){ // Constructor for default values
        // "this" calls the other constructor in this constructor
        this("default", 100_000, "Default Default",
                "default@gmail.com", "0888888888" );
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber){
        this("4111", 12_345, customerName, email, phoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double funds) {
        this.balance += funds;
        System.out.println("Successfully deposited " + funds + "$");
        System.out.println("New balance: " + this.balance + "$");
    }

    public void withdrawFunds(double funds) {
        if ((this.balance - funds) >= 0) {
            this.balance -= funds;
            System.out.println("Successfully withdrawn " + funds + "$");
            System.out.println("New balance: " + this.balance + "$");
        } else {
            System.out.println("Insufficient funds");
            System.out.println("Balance: " + this.balance + "$");
        }
    }
}


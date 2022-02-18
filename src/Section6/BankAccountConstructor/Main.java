package Section6.BankAccountConstructor;

public class Main {

    public static void main(String[] args) {

//        Section6.BankAccount bankAccount = new Section6.BankAccount("4111111111111111", 4_000, "Daniel Varbanov",
////                "kopchence@gmail.com", "0878182688");

//        Section6.BankAccount bankAccount = new Section6.BankAccount();

        BankAccount bankAccount = new BankAccount("Daniel Varbanov", "kopchence@gmail.com", "0878182688");

//        bankAccount.setAccountNumber("4111111111111111");
//        bankAccount.setBalance(4_000);
//        bankAccount.setCustomerName("Daniel Varbanov");
//        bankAccount.setEmail("kopchence@gmail.com");
//        bankAccount.setPhoneNumber("0878182688");

        bankAccount.depositFunds(1_000);
        bankAccount.withdrawFunds(5_000);
    }
}

package Section6.VipCustomer;

public class Main {

    public static void main(String[] args) {

        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println("vipCustomer1 name: " + vipCustomer1.getName());
        System.out.println("vipCustomer1 credit limit: " + vipCustomer1.getCreditLimit());
        System.out.println("vipCustomer1 email: " + vipCustomer1.getEmailAddress());

        VipCustomer vipCustomer2 = new VipCustomer("Dani", 10_000);
        System.out.println("vipCustomer2 name: " + vipCustomer2.getName());
        System.out.println("vipCustomer2 credit limit: " + vipCustomer2.getCreditLimit());
        System.out.println("vipCustomer2 email: " + vipCustomer2.getEmailAddress());

        VipCustomer vipCustomer3 = new VipCustomer("Kircho", 15_000, "kircho@gmail.com");
        System.out.println("vipCustomer3 name: " + vipCustomer3.getName());
        System.out.println("vipCustomer3 credit limit: " + vipCustomer3.getCreditLimit());
        System.out.println("vipCustomer3 email: " + vipCustomer3.getEmailAddress());
    }
}

package Section6.Person;

public class Main {

    public static void main(String[] args) {

        Person dani = new Person();
        dani.setFirstName("Dani");
        dani.setSecondName("Shady");
        dani.setSex("male");
        dani.setAge(26);

        String firstName = dani.getFirstName();
        String secondName = dani.getSecondName();
        String fullName = firstName + " " + secondName;
        String sex = dani.getSex();
        int age = dani.getAge();

        System.out.println("Hello, my name is " + fullName + " and I'm a " +
                            + age + " years old " + sex);
    }
}

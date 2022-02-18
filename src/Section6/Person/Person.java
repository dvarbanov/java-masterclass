package Section6.Person;

public class Person {

    private String firstName;
    private String secondName;
    private String sex;
    private int age;

    public void setFirstName(String firstName) {
        if (firstName.toLowerCase().equals("dani")) {
            this.firstName = "Madafaka " + firstName;
        } else {
            this.firstName = firstName;
        }
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public String getSex() {
        return this.sex;
    }

    public int getAge() {
        return this.age;
    }
}
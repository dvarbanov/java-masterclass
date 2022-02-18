package Section5.Switch;

public class Switch {

    public static void main(String[] args) {

        int switchValue = 5;

        switch(switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is 3 or 4 or 5");
                System.out.println("Actually it is a " + switchValue);
                break;
            default:
                System.out.println("Value is not in range 1-5");
                break; // the last break can be removed but its better to leave it

        }
        char letter = 'B';

        switch (letter) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found " + letter);
                break;
            default:
                System.out.println("Not found");
        }

        String month = "JanuarY";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("It's winter!");
                break;
            default:
                System.out.println("Not January!");
                break;
        }
    }
}

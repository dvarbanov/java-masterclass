package Section5.While;

public class While {

    public static void main(String[] args) {

//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        int count = 1;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//        } while (count !=

//        int count = 1;
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        Challenge

        System.out.println(isEvenNumber(2));

        int number = 4;
        int finishNumber = 20;
        int total = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            total++;
            if (total == 5) {
                break;
            }
        }
        System.out.println("Total even numbers found " + total);


    }
    //  Challenge

    public static boolean isEvenNumber(int number) {
        if (number == 0) {
            return false;
        }
        return (number % 2 == 0);
    }

}

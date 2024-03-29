package Section4.SecondsAndMinutesChallenge;

public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        String result = getDurationString(65,5);
        System.out.println(result);

        result = getDurationString(3600);
        System.out.println(result);

    }
    
    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString;

//        String output = "";
//
//        if (hours < 10) {
//            output += ("0" + hours + "h ");
//        } else {
//            output += (hours + "h ");
//        }
//
//        if (remainingMinutes < 10) {
//            output += ("0" + remainingMinutes + "m ");
//        } else {
//            output += (remainingMinutes + "m ");
//        }
//
//        if (seconds < 10) {
//            output += ("0" + seconds + "s ");
//        } else {
//            output += (seconds + "s ");
//        }
//
//        return output;
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes,remainingSeconds);
    }
}


//Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
//
//You should validate that the first parameter minutes is >= 0.
//
//You should validate that the 2nd parameter seconds is >= 0 and <= 59.
//
//The method should return �gInvalid value�h in the method if either of the above are not true.
//
//If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format �gXXh YYm ZZs�h where XX represents a number of hours, YY the minutes and ZZ the seconds.
//
//Create a 2nd method of the same name but with only one parameter seconds.
//
//Validate that it is >= 0, and return �gInvalid value�h if it is not true.
//
//If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.
//
//Call both methods to print values to the console.
//
//Tips:
//	Use int or long for your number data types is probably a good idea.
//	1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
//	Section4.Methods should be static as we have used previously.
//
//Bonus:
//	For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
//	Create a new console project and call it Section4.SecondsAndMinutesChallenge
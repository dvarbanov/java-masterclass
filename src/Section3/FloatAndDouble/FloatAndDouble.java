package Section3.FloatAndDouble;

public class FloatAndDouble {

    public static void main(String[] args) {
        //      width of int = 32 (4 bytes)
        int myIntValue = 5 / 2;

        //      float myFloatValue = 5.4f; or float myFloatValue = (float) 5.4;

        //      width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;  // 1.6666666

        //      width of double = 64 (8 bytes) (more used than float)
        double myDoubleValue = 5d / 3d;  // more precise than float, 1.6666666666666667

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

//        Challenge

        double poundsValue = 200d;
        double kgValue = poundsValue * 0.45359237d;
        System.out.println(poundsValue + " pounds = " + kgValue + " kg");





    }
}

package Section6.Cylinder;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("Circle.radius = " + circle.getRadius());
        System.out.println("Circle.area = " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.println("Section6.Cylinder.radius = " + cylinder.getRadius());
        System.out.println("Section6.Cylinder.height = " + cylinder.getHeight());
        System.out.println("Section6.Cylinder.area = " + cylinder.getArea());
        System.out.println("Section6.Cylinder.volume = " + cylinder.getVolume());
    }
}

package Section6.PoolArea;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = length;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return (getArea() * getHeight());
    }
}

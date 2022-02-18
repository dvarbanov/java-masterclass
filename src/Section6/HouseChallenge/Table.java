package Section6.HouseChallenge;

public class Table {

    private String shape;
    private String material;
    private int legs;

    public Table(String shape, String material, int legs) {
        this.shape = shape;
        this.material = material;
        this.legs = legs;
    }

    public String getShape() {
        return shape;
    }

    public String getMaterial() {
        return material;
    }

    public int getLegs() {
        return legs;
    }

    public void squeak() {
        System.out.println("The table squeaked.");
    }
}

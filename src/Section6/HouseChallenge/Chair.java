package Section6.HouseChallenge;

public class Chair {

    private int height;
    private String material;

    public Chair(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public void meditate() {
        System.out.println("The chair is meditating.");
    }
}

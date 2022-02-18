package Section6.HouseChallenge;

public class Door {

    private String material;
    private String color;
    private Lock lock;

    public Door(String material, String color, Lock lock) {
        this.material = material;
        this.color = color;
        this.lock = lock;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public void bash() {
        System.out.println("Bashed the fuc*ing door!");
    }
}

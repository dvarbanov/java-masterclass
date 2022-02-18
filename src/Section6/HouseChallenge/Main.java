package Section6.HouseChallenge;

public class Main {

    public static void main(String[] args) {

        Door door = new Door("metal", "gray", new Lock("ball", "silver"));
        Table table = new Table("round", "wood", 3);

        House house = new House(door, table, new Chair(15, "wood"));

        house.describeRoom();

    }
}

package Section6.HouseChallenge;

public class House {

    private Door door;
    private Table table;
    private Chair chair;

    public House(Door door, Table table, Chair chair) {
        this.door = door;
        this.table = table;
        this.chair = chair;
    }

    public Door getDoor() {
        return door;
    }
//
//    public Table getTable() {
//        return table;
//    }
//
//    public Chair getChair() {
//        return chair;
//    }

    public void describeRoom() {
        this.chair.meditate();
        this.table.squeak();
        this.getDoor().bash();
    }
}

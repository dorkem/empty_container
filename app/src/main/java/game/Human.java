package game;

public class Human {
    private final Weapon wepon;
    private String name;

    public Human(Weapon wepon, String name) {
        this.wepon = wepon;
        this.name = name;
    }

    public void attackHuman(Human other) {
        System.out.println(this.name +" attacking " + other.name);
        wepon.attack();
    }
}
package game;

public class Bow implements Weapon {

    @Override
    public String getWeaponName() {
        return "bow";
    }

    @Override
    public void attack() {
        System.out.println("bow attack!");
    }
}
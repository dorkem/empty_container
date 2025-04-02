package game;

public class Sword implements Weapon {
    @Override
    public String getWeaponName() {
        return "sword";
    }

    @Override
    public void attack() {
        System.out.println("sword attack!");
    }
}

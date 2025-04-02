package game;

public class AppConfig {
    private static final AppConfig instance = new AppConfig();

    private AppConfig() {}

    public static AppConfig getInstance() {
        return instance;
    }

    public Weapon getWeapon(String type) {
        switch (type.toLowerCase()) {
            case "sword" -> {
                return new Sword();
            }
            case "bow" -> {
                return new Bow();
            }
            default -> throw new IllegalArgumentException("Unknown Wepon type: " + type);
        }
    }

    public Human createHuman (String type, String name) {
        return new Human(getWeapon(type), name);
    }
}

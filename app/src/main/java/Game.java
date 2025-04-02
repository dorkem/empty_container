import game.AppConfig;
import game.Human;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Game {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();

        try (InputStream input = Game.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new FileNotFoundException("application.properties not found in resources!");
            }
            props.load(input);
        }

        AppConfig config = AppConfig.getInstance();

        String weaponType1 = props.getProperty("weapon1");
        String weaponType2 = props.getProperty("weapon2");

        Human human1 = config.createHuman(weaponType1, "hoon");
        Human human2 = config.createHuman(weaponType2, "Bazzi");

        human1.attackHuman(human2);
        human2.attackHuman(human1);
    }
}


import game.Human;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Game {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Human player1 = context.getBean("player1", Human.class);
        Human player2 = context.getBean("player2", Human.class);

        player1.attackHuman(player2);
        player2.attackHuman(player1);
    }
}

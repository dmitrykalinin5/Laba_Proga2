package Attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public class Slack_Off extends StatusMove {
    @Override
    protected void applySelfEffects(Pokemon var1) {
        // Сомнительно (нужно отхилить на половину от макс здоровья)
        Effect hp = (new Effect());
        hp.stat(Stat.HP, (int) var1.getHP() / 2);
    }
    @Override
    protected String describe() {
        return "использует Slack_Off";
    }
}
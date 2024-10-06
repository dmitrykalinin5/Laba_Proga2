package Attacks;
import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Slack_Off extends StatusMove {
    public Slack_Off() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe() {
        return "Восстанавливает до 50% максимального HP";
    }
}
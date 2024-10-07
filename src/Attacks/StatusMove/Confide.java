package Attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    @Override
    protected void applyOppEffects(Pokemon var1) {
        var1.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    @Override
    protected String describe() {
        return "использует Confide";
    }
}
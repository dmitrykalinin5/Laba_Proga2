package Attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove {
    @Override
    protected void applySelfEffects(Pokemon var1) {
        var1.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe() {
        return "использует Double_Team";
    }
}

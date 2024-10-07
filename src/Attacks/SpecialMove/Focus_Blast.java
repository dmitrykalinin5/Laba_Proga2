package Attacks.SpecialMove;
import ru.ifmo.se.pokemon.*;

public class Focus_Blast extends SpecialMove {
    public Focus_Blast() {
        super(Type.FIGHTING, 120, 70);
    }
    @Override
    protected void applyOppEffects(Pokemon var1) {
        var1.setCondition(new Effect().chance(0.1).stat(Stat.SPECIAL_ATTACK, -1).turns(1));
    }
    @Override
    protected String describe() {
        return "использует Focus_Blast";
    }
}
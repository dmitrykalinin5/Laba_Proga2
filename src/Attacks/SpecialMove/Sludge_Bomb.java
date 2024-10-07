package Attacks.SpecialMove;
import ru.ifmo.se.pokemon.*;

public class Sludge_Bomb extends SpecialMove {
    public Sludge_Bomb() {
        super(Type.POISON, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon var1) {
        var1.setCondition((new Effect()).condition(Status.POISON).chance(0.3));
    }
    // Добавить 30% процентный шанс отравления
    @Override
    protected String describe() {
        return "использует Sludge_Bomb";
    }
}

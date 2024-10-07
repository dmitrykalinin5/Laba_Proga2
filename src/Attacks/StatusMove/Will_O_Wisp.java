package Attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public class Will_O_Wisp extends StatusMove {
    public Will_O_Wisp() {
        super(Type.FIRE, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon var1) {
        var1.setCondition(new Effect().condition(Status.BURN));
    }
    @Override
    protected String describe() {
        return "использует Will-O-Wisp";
    }
}
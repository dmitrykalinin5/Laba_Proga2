package Attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon var1) {
        var1.setMod(Stat.ATTACK, 2);
        var1.confuse();
    }
        /* еще чет */
    @Override
    protected String describe() {
        return "использует Swagger";
    }
}
package Attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public class Low_Sweep extends PhysicalMove {
    public Low_Sweep() {
        super(Type.FIGHTING, 65, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon var1) {
        var1.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe() {
        return "использует Low_Sweep";
    }
}
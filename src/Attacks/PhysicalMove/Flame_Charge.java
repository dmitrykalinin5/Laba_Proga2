package Attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;

public class Flame_Charge extends PhysicalMove {
    public Flame_Charge() {
        super(Type.FIRE, 50, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon var1) {
        var1.setMod(Stat.SPEED, 1);
    }
    @Override
    protected String describe() {
        return "использует Flame_Charge";
    }
}
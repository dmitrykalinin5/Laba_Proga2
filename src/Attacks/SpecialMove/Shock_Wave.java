package Attacks.SpecialMove;
import ru.ifmo.se.pokemon.*;

public class Shock_Wave extends SpecialMove {
    public Shock_Wave() {
        super(Type.ELECTRIC, 60, 100);
    }
    @Override
    protected String describe() {
        return "использует Shock_Wave";
    }
}
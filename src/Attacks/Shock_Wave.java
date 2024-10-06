package Attacks;
import ru.ifmo.se.*;
import ru.ifmo.se.pokemon.*;

public class Shock_Wave extends SpecialMove {
    public Shock_Wave() {
        super(Type.ELECTRIC, 60, 1000000000);
    }
    //@Override
    //protected void
    @Override
    protected String describe() {
        return "Наносит урон и игнорирует изменения в показателях " +
                "точности и уклонения. Однако она не поразит покемона на этапах неуязвимости: " +
                "\"Bounce\", \"Bid\", \"Dive\", \"Fly\", \"Phantom Force\", \"Shadow Force\" или \"Sky Drop\".";
    }
}

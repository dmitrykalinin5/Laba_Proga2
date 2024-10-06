package Attacks;
import ru.ifmo.se.*;
import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 10000000);
    }

    @Override
    protected void applyOppEffects(Pokemon var1) {
        var1.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    @Override
    protected String describe() {
        return "Снижает силу специальной атаки противника на 1 уровень. " +
                "Каждая характеристика может быть снижена максимум на -6 уровней.";
    }
}
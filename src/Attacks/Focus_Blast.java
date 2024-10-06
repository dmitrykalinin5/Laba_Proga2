package Attacks;
import ru.ifmo.se.*;
import ru.ifmo.se.pokemon.*;
import java.util.Random;

public class Focus_Blast extends SpecialMove {
    public Focus_Blast() {
        super(Type.FIGHTING, 120, 70);
    }
    @Override
    protected void applyOppEffects(Pokemon var1) {
        Random random = new Random(); // выполняем if с 10-ти процентным шансом
        if (random.nextInt(100) < 10) { var1.setMod(Stat.SPECIAL_ATTACK, -1); }
    }
    @Override
    protected String describe() {
        return "Наносит урон и с вероятностью 10% снижает специальную защиту цели на 1 уровень. " +
                "Каждая характеристика может быть снижена максимум на -6 уровней.";
    }
}
package Attacks;
import ru.ifmo.se.*;
import ru.ifmo.se.pokemon.*;
import java.util.Random;

public class Sludge_Bomb extends SpecialMove {
    public Sludge_Bomb() {
        super(Type.POISON, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon var1) {
        Random random = new Random(); // выполняем if с 10-ти процентным шансом
        //if (random.nextInt(100) < 30) { var1.addEffect(Status.POISON); }
    }
    // Добавить 30% процентный шанс отравления
    @Override
    protected String describe() {
        return "Наносит урон и имеет 30%-ный шанс отравить цель. " +
                "Покемоны, имеющие иммунитет к способности, не могут быть отравлены";
    }
}

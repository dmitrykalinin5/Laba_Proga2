package Attacks;
import ru.ifmo.se.*;
import ru.ifmo.se.pokemon.*;

public class Sludge_Bomb extends SpecialMove {
    public Sludge_Bomb() {
        super(Type.POISON, 90, 100);
    }
    // Добавить 30% процентный шанс отравления
    @Override
    protected String describe() {
        return "Наносит урон и имеет 30%-ный шанс отравить цель. " +
                "Покемоны, имеющие иммунитет к способности, не могут быть отравлены";
    }
}

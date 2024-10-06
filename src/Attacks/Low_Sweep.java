package Attacks;
import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Low_Sweep extends PhysicalMove {
    public Low_Sweep() {
        super(Type.FIGHTING, 65, 100);
    }

    @Override
    protected String describe() {
        return "Наносит урон и снижает скорость противника на 1 уровень. " +
                "Каждая характеристика может быть снижена максимум на -6 уровней.";
    }
}
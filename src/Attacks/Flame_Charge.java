package Attacks;
import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Flame_Charge extends PhysicalMove {
    public Flame_Charge() {
        super(Type.FIRE, 50, 100);
    }
        /* еще чет */
    @Override
    protected String describe() {
        return "Наносит урон и повышает скорость игрока на один уровень. " +
                "Каждая характеристика может быть увеличена максимум на +6 уровней.";
    }
}
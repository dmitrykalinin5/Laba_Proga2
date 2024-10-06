package Attacks;
import ru.ifmo.se.*;
import ru.ifmo.se.pokemon.*;

public class Focus_Blast extends SpecialMove {
    public Focus_Blast() {
        super(Type.FIGHTING, 120, 70);
    }
    // Добавить 10% chance of lowering the target's Special Defense by one stage
    @Override
    protected String describe() {
        return "Наносит урон и с вероятностью 10% снижает специальную защиту цели на 1 уровень. " +
                "Каждая характеристика может быть снижена максимум на -6 уровней.";
    }
}

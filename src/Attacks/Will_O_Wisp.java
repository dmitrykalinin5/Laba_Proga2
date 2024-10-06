package Attacks;
import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Will_O_Wisp extends StatusMove {
    public Will_O_Wisp() {
        super(Type.FIRE, 0, 85);
    }

    @Override
    protected String describe() {
        return "Поджигает цель. Подоженная цель теряет 1/8 от максимального HP за каждый ход и его атака снижается на 50%";
    }
}
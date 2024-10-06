package Attacks;
import ru.ifmo.se.*;
import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove {
    public Double_Team() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon var1) {
        var1.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe() {
        return "Повышает уворотливость игрока на 1 уровень, затрудняя попадание в него. " +
                "Каждая характеристика может быть увеличена максимум на +6 уровней.";
    }
}

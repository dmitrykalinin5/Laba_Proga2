package Attacks;
import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon var1) {
        var1.setMod(Stat.ATTACK, 2);
        var1.confuse();
    }
        /* еще чет */
    @Override
    protected String describe() {
        return "Оглушает цель и повышает ее атаку на два уровня. Если один из " +
                "двух эффектов не может быть активирован (например, цель уже сбита с " +
                "толку или ее атака уже повышена до максимального уровня +6), " +
                "Swagger все равно работает и активирует другой эффект. Оглушенный покемон имеет " +
                "33%-ный шанс поранить себя за каждый ход, в течение 1-4 ходов (50%-ный шанс в поколениях 1-6). " +
                "Получаемый урон выглядит так, как если бы покемон атаковал сам себя физической атакой с 40 базовой силой.";
    }
}
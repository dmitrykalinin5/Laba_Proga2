package Pokemons;
import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Chimchar extends Pokemon {
    public Chimchar(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.FIRE);
        this.setStats(44, 58, 44, 58, 44, 61);
        super.addMove(new Swagger());
        super.addMove(new Flame_Charge());
    }
}

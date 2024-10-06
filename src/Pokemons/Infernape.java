package Pokemons;
import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Infernape extends Monferno {
    public Infernape(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.FIRE);
        this.setStats(76, 104, 71, 104, 71, 108);
        super.addMove(new Will_O_Wisp());
    }
}

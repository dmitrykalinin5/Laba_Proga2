package Pokemons;
import Attacks.SpecialMove.Focus_Blast;
import ru.ifmo.se.pokemon.*;

public class Heliolisk extends Helioptile {
    public Heliolisk(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.ELECTRIC);
        this.setStats(62, 55, 52, 109, 94, 109);
        super.addMove(new Focus_Blast());
    }
}

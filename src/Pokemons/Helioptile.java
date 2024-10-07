package Pokemons;
import Attacks.PhysicalMove.Low_Sweep;
import Attacks.StatusMove.Confide;
import Attacks.StatusMove.Double_Team;
import ru.ifmo.se.pokemon.*;

public class Helioptile extends Pokemon {
    public Helioptile(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.ELECTRIC);
        this.setStats(44, 38, 33, 61, 43, 70);
        super.addMove(new Confide());
        super.addMove(new Double_Team());
        super.addMove(new Low_Sweep());
    }
}

package Pokemons;
import Attacks.SpecialMove.Focus_Blast;
import Attacks.SpecialMove.Shock_Wave;
import Attacks.SpecialMove.Sludge_Bomb;
import Attacks.StatusMove.Double_Team;
import ru.ifmo.se.pokemon.*;

public class Thundurus extends Pokemon {
    public Thundurus(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.ELECTRIC);
        this.setStats(79, 115, 70, 125, 80, 111);
        super.addMove(new Sludge_Bomb());
        super.addMove(new Shock_Wave());
        super.addMove(new Focus_Blast());
        super.addMove(new Double_Team());
    }
}
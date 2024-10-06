package Pokemons;
import Attacks.*;
import ru.ifmo.se.pokemon.*;

public class Monferno extends Chimchar {
    public Monferno(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.FIRE);
        this.setStats(64, 78, 52, 78, 52, 81);
        super.addMove(new Slack_Off());
    }
}

import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Helioptile("Чужой", 1);
        Pokemon p2 = new Thundurus("Хищник", 1);
        Pokemon p3 = new Chimchar("Боец", 1);

        Pokemon s1 = new Helioptile("Красаучик", 1);
        Pokemon s2 = new Thundurus("Гений", 1);
        Pokemon s3 = new Chimchar("Жесточайший", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(s1);
        b.addFoe(s2);
        b.addFoe(s3);
        b.go();
    }
}
import ru.ifmo.se.pokemon.*;
import pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon castform = new Castform("poke_castform", 1);
        Pokemon sentret = new Sentret("poke_sentret", 47);
        Pokemon furret = new Furret("poke_furret", 1);

        Pokemon grubbin = new Grubbin("poke_grubbin", 1);
        Pokemon charjabug = new Charjabug("poke_charjabug", 43);
        Pokemon vikavolt = new Vikavolt("poke_vikavolt", 1);

        b.addAlly(castform);
        b.addAlly(sentret);
        b.addAlly(furret);
        
        b.addFoe(grubbin);
        b.addFoe(charjabug);
        b.addFoe(vikavolt);
        
        b.go();
    }
    
}

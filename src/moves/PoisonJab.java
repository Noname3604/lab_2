package moves;

import ru.ifmo.se.pokemon.*;

public final class PoisonJab extends PhysicalMove {
    public PoisonJab() { super(Type.POISON, 80, 100); }
    boolean posioned = false;
    Pokemon attacker = null;
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect.poison(p);
            posioned = true;
        }
        posioned = false;
    }
    
    @Override
    protected String describe() {
        if (posioned) {
            return "использует Posion Jab и отравляет";
        }
        return "использует Posion Jab";
    }
}
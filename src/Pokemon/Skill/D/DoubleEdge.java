package Skill.D;

import Pokemons.Type;
import Skill.*;

public class DoubleEdge extends Skill{
    private static final String name = "Double-Edge";
    private static final Type type = new Type("Normal");
    private static final String ID = "none";
    private static final int baseDamage = 120;
    private static final String description = "Double-Edge deals damage, but the user receives 1⁄3 of the damage it inflicted in recoil.\n"  +
            "In other words, if the attack does 90 HP damage to the opponent, the user will lose 30 HP.";

    public DoubleEdge() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description, 15);
    }

    @Override
    public int effect(Pokemon pokemon) {
        return super.effect(pokemon);
    }

    @Override
    public int defenseEffect(Pokemon pokemon) {
        return super.defenseEffect(pokemon);
    }

    @Override
    public int speedEffect(Pokemon pokemon) {
        return super.speedEffect(pokemon);
    }

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public int getBaseDamage() {
        return this.baseDamage;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
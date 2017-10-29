package Skill.A;

import Pokemons.Type;
import Skill.*;

public class AquaJet extends Skill{
    private   String name ;
    private   Type type ;
    private   String ID ;
    private   int baseDamage ;
    private   String description;
    private int PP;


    public AquaJet() {
        this.name = "Aqua Jet";
        this.type = new Type("Water");
        this.ID = "none";
        this.baseDamage = 40;
        this.description  = "Aqua Jet deals damage and has a priority of +1.\n" +
                "Moves with a higher priority always go first, regardless of a Pokémon's speed.\n"+
                "If two moves with the same priority are used, the faster Pokémon goes first as usual.";
        this.PP = 20;
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

    @Override
    public int getPP() {
        return this.PP;
    }
}

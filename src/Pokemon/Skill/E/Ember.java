package Pokemon.Skill.E;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class Ember extends Skill{
    private  String name ;
    private  Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;

    public Ember() {
        super();
        this.name = "Ember";
        this.type  = new Type("Fire");
        this.ID = "none";
        this.baseDamage = 40;
        this.description = "Ember deals damage and has a 10% chance of burning the target.\n" +
                "Fire type Pokémon, those with the ability Water Veil or those behind a Substitute cannot be burned.\n";
        this.PP = 25;
        this.category = "Special";
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

    public String getCategory() {
        return category;
    }
}

package Pokemon.Skill.D;

import Pokemon.Type;
import Pokemon.Skill.*;
import Pokemon.Pokemon;

public class DynamicPunch extends Skill {
    private  String name ;
    private Type type;
    private  String ID;
    private int baseDamage ;
    private String description ;
    private int PP;
    private String category;

    public DynamicPunch() {
        super();
        this.name = "Dynamic Punch";
        this.type  = new Type("Fighting");
        this.ID = "TM01";
        this.baseDamage = 100;
        this.description = "Dynamic Punch deals damage and confuses the target, if it hits. Confused Pokémon have a 50% chance of hurting themselves each turn, for 1-4 turns.\n" +
                "The damage received is as if the Pokémon attacks itself with a typeless 40 base power Physical attack.\n" +
                "Pokémon with the ability Own Tempo or those behind a Substitute cannot be confused.";
        this.PP = 5;
        this.category = "Physical";
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
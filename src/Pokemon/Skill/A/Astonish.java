<<<<<<< HEAD
package Skill.A;

import Pokemons.Type;
import Skill.*;

public class Astonish extends Skill{
    private static final String name = "Astonish";
    private static final Type type = new Type("Ghost");
    private static final String ID = "none";
    private static final int baseDamage = 30;
    private static final String description = "Astonish deals damage and has a 30% chance of causing the target to flinch (if the target has not yet moved).\n" +
            "Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.";

    public Astonish() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description);
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
=======
package Skill.A;

import Pokemons.Type;
import Skill.*;

public class Astonish extends Skill{
    private static final String name = "Astonish";
    private static final Type type = new Type("Ghost");
    private static final String ID = "none";
    private static final int baseDamage = 30;
    private static final String description = "Astonish deals damage and has a 30% chance of causing the target to flinch (if the target has not yet moved).\n" +
            "Pokémon with the ability Inner Focus or those behind a Substitute cannot be made to flinch.";

    public Astonish() {
        super(this.ID, this.name, this.type, this.baseDamage, this.description);
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
>>>>>>> 90693d60b0828c75d3160ae52fc74f69c760d587
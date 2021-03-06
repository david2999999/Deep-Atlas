package Pokemon.Skill;

import Pokemon.Pokemon.Type;

public class FocusBlast extends Skill{
    private static final String name = "Focus Blast";
    private static final Type type = new Type("Fighting");
    private static final String ID = "TM52";
    private static final int baseDamage = 120;
    private static final String description = "Focus Blast deals damage and has a 10% chance of lowering the target's Special Defense by one stage.\n" +
            "Stats can be lowered to a minimum of -6 stages each.";

    public FocusBlast() {
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

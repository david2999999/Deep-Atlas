package Pokemon.ItemBag.Berries.AllBerry;

import Pokemon.ItemBag.Berries.Berry;
import Pokemon.Pokemons.Pokemon;

public class Oran extends Berry {

    public Oran() {
        super("Oran Berry",
                "A Berry to be consumed by Pokémon. If a Pokémon holds one, it can restore its own HP by 10 points during battle.\n",
                 16,
                 0,
                 1.4,
                 "Can be found in berry piles in Routes 2, 8, 16, and AllBerry fields.\n",
                 "Super hard\n");
    }

    @Override
    public boolean useBerry(Pokemon pokemon) {
        int currentHpOfPokemon = pokemon.getCurrentHp() + 10;
        if (pokemon.getCurrentHp() == pokemon.getHp()){
            System.out.println("\t\t\t\t\tThere is no effect ꒰ ꒪⌑꒪꒱˖ꂚ*ᵎ");
            return false;
        }else if(currentHpOfPokemon > pokemon.getHp()){
            // if the berry adds to an amount greater than the max hp. Set the current hp
            // to max hp
            System.out.println("Used an Oran Berry");
            System.out.println(pokemon.getName() + "'s HP is restored to full.");
            pokemon.setCurrentHp(pokemon.getHp());
            return true;
        }else{
            // anything else. just set the current hp after using the potion
            System.out.println("Used an Oran Berry");
            System.out.printf(pokemon.getName() + "'s HP is restored to " + currentHpOfPokemon);
            pokemon.setCurrentHp(currentHpOfPokemon);
            return true;
        }
    }
}

package Pokemon;

import java.util.Collections;

import Pokemon.ItemBag.Bag;
import Pokemon.Pokemons.Pokemon;

public class PokemonPlayer {
    private String name;
    private String gender;
    private PokemonBag pokemonBag;
    private Bag itembag;
    private int money;
    private Pokemon pokemonActive;

    public PokemonPlayer(String name, String gender, PokemonBag pokemonBag, Bag itembag) {
        this.name = name;
        this.gender = gender;
        this.pokemonBag = pokemonBag;
        this.itembag = itembag;
        this.money = 0;
        // Active pokemon is the first pokemon in the bag
        this.pokemonActive = pokemonBag.getPokemon().get(0);
    }

    // switches to a pokemon in the bag using its index value
    public boolean switchPokemon(int num){
        if (num < 0 || num > 5){
            System.out.println("There are only 6 pokemon (0 - 5) (ꐦ ಠ皿ಠ ) ");
            return false;
        }else if(num == 0){
            // Telling the player the first pokemon in the bag is already in battle
            // if the pokemon has 0 hp. Returns a false
            if (this.pokemonBag.getPokemon().get(0).getCurrentHp() == 0){
                System.out.println(this.pokemonBag.getPokemon().get(0).getName() + " fainted (」ﾟﾛﾟ)｣NOOOooooo━ʔ Choose another pokemon!   ?(ο´･д･)??");
                return false;
            }else {
                System.out.println(this.pokemonBag.getPokemon().get(0).getName() + " is already on the battle field (ꐦ ಠ皿ಠ )");
                return false;
            }
        }
        else{
            // checks if the pokemon is a fainted pokemon before switching
            // if the pokemon is a fainted pokemon
            if (this.pokemonBag.getPokemon().get(num).getCurrentHp() == 0){
                System.out.println(this.pokemonBag.getPokemon().get(num).getName() + " is unable to battle (」ﾟﾛﾟ)｣NOOOooooo. Choose a different pokemon. ?(ο´･д･)??");
                return false;
            }else{
                // if the pokemon is not fainted
                // swaps the 2 pokemon in the pokemon bag
                System.out.println("\t\t\t\t\t" + this.pokemonActive.getName() + " return! ʕ>⌓<｡ʔ");
                Collections.swap(this.pokemonBag.getPokemon(), 0, num);
                this.pokemonActive = this.pokemonBag.getPokemon().get(0);
                System.out.println("\t\t\t\t\tGo! " + this.pokemonActive.getName() + " ୧ʕ ◕ o ◕ ʔ୨");
                System.out.println();
                return true;
            }

        }
    }

    // This method chooses the active pokemon based on the first non-zero current hp pokemon
    // mainly used for player battle. (Enemy Player)
    public void chooseActivePokemon(){
        for (int i = 0; i <  this.pokemonBag.getPokemon().size(); i++){
            if (this.pokemonBag.getPokemon().get(i).getCurrentHp() != 0){
                setPokemonActive(this.pokemonBag.getPokemon().get(i));
            }
        }
        System.out.println("\t\t\t\t" + this.getName() + " chooses " + this.getPokemonActive().getName() + " ୧ʕ ⇀ ⌂ ↼ ʔ୨");
    }


    // check if the player black out due to all of the pokemon fainted
    public boolean isBlackOut(){
        int pokemonFainted = 0;

        for (Pokemon pokemon : this.pokemonBag.getPokemon()){
            if (pokemon.getCurrentHp() == 0){
                ++pokemonFainted;
            }
        }

        // if the number of fainted pokemon is equal to the total
        // returns true. The player blacks out
        // returns false. The player does not black out
        if (pokemonFainted == this.pokemonBag.getPokemon().size()){
            return true;
        }else{
            return false;
        }
    }

    // getters
    public PokemonBag getPokemonBag() {
        return pokemonBag;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Bag getItembag() {
        return itembag;
    }

    public Pokemon getPokemonActive() {
        return pokemonActive;
    }

    // Setters for the active pokemon or the first pokemon in the party
    public void setPokemonActive(Pokemon pokemonActive) {
        this.pokemonActive = pokemonActive;
    }
}

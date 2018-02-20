import java.util.ArrayList;

public class PokemonFarm {
	private ArrayList<Pokemon> myPokemon;
	public PokemonFarm() {
		myPokemon = new ArrayList<Pokemon>();
	}
	public void addPokemon(Pokemon pokemon) {
		myPokemon.add(pokemon);
	}
	public void removePokemon(Pokemon pokemon) {
		myPokemon.remove(pokemon);
	}
	public void list(){
		for(Pokemon Pokemon:myPokemon ){
			Pokemon.print();
		}
	}
	public void feed(String pokemonName){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: myPokemon){
				
				pokemon.eat();
			}
		}
		else {
			for(Pokemon pokemon: myPokemon){
				if(pokemon.getName().equals(pokemonName))
					pokemon.eat();
			}
		}
	}
	public void move(String pokemonName,double move) {
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: myPokemon){	
				pokemon.moveStep(move);
			}
		}
		else {
			for(Pokemon pokemon: myPokemon){
				if(pokemon.getName().equals(pokemonName))
					pokemon.moveStep(move);
			}
		}
		
	}

}

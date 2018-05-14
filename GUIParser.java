import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GUIParser {
	private TrainerPokemon pokemonTrainer;
	private ArrayList<Pokemon> myPokemons;
	private ArrayList<Pokemon> rivalPokemon;
	private Berry berry;
	
	public GUIParser(String pokemonTrainer) {
		this.pokemonTrainer = new TrainerPokemon(pokemonTrainer);
		myPokemons = new ArrayList();
		rivalPokemon = new ArrayList();
	}
	public int selectPokemon(String name) {
		int n = JOptionPane.showConfirmDialog(
			    null,
			    "Would you like "+name+"?",
			    "Would you like ...",
			    JOptionPane.YES_NO_OPTION);
		 if(n==0) {
			 if(name.equals("Bulbasaur")) {
				 myPokemons.add(new Bulbasaur());
			 }
			 else if(name.equals("Hitokage")) {
				 myPokemons.add(new Hitokage());
			 }
			 else if(name.equals("Squirtle")) {
				 myPokemons.add(new Squirtle()); 
			 }
		 }
		 return n;
			//System.out.print(n);
		}
	public  String  printPokemons(){
		String  detail;
		detail="=======  My Pokemon =======\n";
		for(Pokemon pokemon: myPokemons){
			detail+="Pokemon "+pokemon.getName()+" health: "+Math.round(pokemon.getHealth())+"/"+Math.round(pokemon.maxHealth)+"\nweight: "+Math.round(pokemon.getWeight())+" kg\n";
		}
		return detail;
	}
	public void feedPokemon(int b) {
		berry = new Berry(b);
		for(Pokemon pokemon: myPokemons) {
			pokemon.eat(berry);
		}
	}
	public void excercisePokemon(int b) {
		for(Pokemon pokemon : myPokemons ) {
			if(b==0) {
				pokemon.move();
			}
		}
	}
	public String getImgPath() {
		return myPokemons.get(0).getImgPath();
	}

	public void dicoverRival() {	
		double randomType=Math.random()*10;
			if(randomType < 5) {
				rivalPokemon.add(new Pikachu());
			}	
			else {
				rivalPokemon.add(new Koduck());
			} 
	}
	public void pokemonBattle() {
		rivalPokemon.get(0).attack(myPokemons.get(0));
	}
	public String getRivalImgPath() {
		return rivalPokemon.get(0).getImgPath();
	}
	public String getRivalPokemonName() {
		return rivalPokemon.get(0).getName();
	}
}
	
	

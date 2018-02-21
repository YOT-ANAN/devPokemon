
public class Wild {
	
	public String discoverPokemon() {
		double randomType=Math.random()*10;
		if(randomType < 5)
			return "Pikachu";
		else if(randomType < 7)
			return "Raichu";
		else 
			return "Mewtwo";
	}
	/*public Pokemon discoverPokemons() {
		double randomType=Math.random()*10;
		if(randomType < 5) {
			Mewtwo mewtwo = new Mewtwo("WildPokemon","Mewtwo");
			return mewtwo;
		}
		else if(randomType < 7)
			return "Raichu";
		else 
			return "Mewtwo";
	}*/

}

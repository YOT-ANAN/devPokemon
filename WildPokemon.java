
public class WildPokemon extends Pokemon {
	private double mood;
	public WildPokemon (String type) {
		super("WildPokemon", type);
		setMood();
		
	}
	private void setMood() {
		this.mood=Math.random();
	}
	public double getMood() {
		return this.mood;
	}
	
}

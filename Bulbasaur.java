public class Bulbasaur extends Pokemon implements Runnable{
	private static final int maxGroupHealth = 200;
	public Bulbasaur() {
		super("Bulbasaur",
			      (Math.random()*1000) % (maxGroupHealth+1));

			this.attackSkill = PokemonSkill.getPokemonSkill("Thunder Shock");
			this.untimatedSkill = PokemonSkill.getPokemonSkill("Thunderbolt");
			this.imgPath="C:\\\\Users\\\\toY\\\\Desktop\\\\pokemon_picture\\\\Bulbasaur.gif";
			this.imgPath="images/Bulbasaur.gif";
	}
	

	public void move(){
		this.run();
	}
	public void run(){
		this.reducedHealth(10);
	}
	public void walk(){
		this.reducedHealth(1);
	}
}
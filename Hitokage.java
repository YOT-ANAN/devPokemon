public class Hitokage extends Pokemon implements Runnable{
	private static final int maxGroupHealth = 200;
	public Hitokage() {
		super("Hitokage",
			      (Math.random()*1000) % (maxGroupHealth+1));

			this.attackSkill = PokemonSkill.getPokemonSkill("Thunder Shock");
			this.untimatedSkill = PokemonSkill.getPokemonSkill("Thunderbolt");
			this.imgPath="C:\\\\Users\\\\toY\\\\Desktop\\\\pokemon_picture\\\\hitokage.gif";
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

public class Squirtle extends Pokemon implements Swimmable {
	private static final int maxGroupHealth = 200;
	

	public Squirtle() {
		super("Squirtle",(Math.random()*1000) % (maxGroupHealth+1));
		this.attackSkill = PokemonSkill.getPokemonSkill("Water Gun");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Surf");
		this.imgPath="C:\\\\Users\\\\toY\\\\Desktop\\\\pokemon_picture\\\\Squirtle.gif";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		this.reducedHealth(30);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.swim();
	}
	

}

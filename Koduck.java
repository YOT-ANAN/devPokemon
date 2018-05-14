
public class Koduck extends Pokemon implements Swimmable {
	private static final int maxGroupHealth = 200;

	public Koduck() {
		super("Koduck",(Math.random()*1000) % (maxGroupHealth+1));
		this.attackSkill = PokemonSkill.getPokemonSkill("Water Gun");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Surf");
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

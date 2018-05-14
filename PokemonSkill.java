public class PokemonSkill{
	private String name;
	private float damage;

	public PokemonSkill(String name, float damage){
		this.name = name;
		this.damage = damage;
	}

	public String getName(){
		return this.name;
	}

	public float getDamage(){
		return this.damage;
	}

	public static PokemonSkill getPokemonSkill(String name){
		PokemonSkill skill = null;
		switch(name.toLowerCase()){
			case "thunder shock":
				skill = new PokemonSkill("Thunder Shock",40);
				break;
			case "thunderbolt":
				skill = new PokemonSkill("Thunderbolt",90);
				break;
			case "tail whip":
				skill = new PokemonSkill("Tail Whip",10);
				break;
			case "water pulse":
				skill = new PokemonSkill("Water Pulse",100);
				break;
			case "water gun":
				skill = new PokemonSkill("Water Gun", 60);
				break;
			case "surf":
				skill = new PokemonSkill("Surf", 70);
				break;
			case "fire ball":
				skill = new PokemonSkill("Fire Ball", 60);
				break;
			case "solar beam":
				skill = new PokemonSkill("Solar Beam", 80);
				break;
		}
		return skill;
	}
}

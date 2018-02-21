
public class Pokeball {
	private	String type;
	private double opportunity ;
	
	public Pokeball(String type) {
		setType(type);
		setOpportunity();
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public double getOpportunity() {
		return opportunity;
		
	}
	private void setOpportunity() {
		if(type.equals("PokeBall"))
			opportunity=0.8;
		else if(type.equals("GreatBall"))
			opportunity=0.9;
		else if(type.equals("UltraBall"))
			opportunity=1.0;
	
	}
	public void catchPokemon(Pokemon pokemon) {
		double result=pokemon.getMood()*opportunity;
		if(result>0.5) 
			System.out.println("Success");
		else if(result<=0.5)
			System.out.println("Fail");
	}

}

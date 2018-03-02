import java.util.ArrayList;

import java.util.*;

public class Pokeball {
	private	String type;
	private double opportunity ;
	private Scanner sc;
	
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
	public void catchPokemon(Pokemon pokemon,ArrayList<Pokemon> myBag) {
		double result=pokemon.getMood()*opportunity;
		if(result>0.5) {
			System.out.println("Success");
			myBag.add(pokemon);
			System.out.print("Set your pokemon name : ");
			setName(pokemon);
			
		}
		else if(result<=0.5)
			System.out.println("Fail");
	}
	public void setName(Pokemon pokemon) {
		sc = new Scanner (System.in);
		pokemon.setName(sc.nextLine());
	}

}

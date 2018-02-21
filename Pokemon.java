import java.util.Random;

public class Pokemon {
	private String name;
	private String type;
	private double weight;
	private double stepLenght;
	private double distance;
	private double mood;

	
	public Pokemon(String name,String type){
		setName(name);
		this.type=type;
		setWeight();
		setStepLenght();
		setMood();
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return this.type;
	}
	private double setWeight() {
		return this.weight=Math.random()*10;
	}
	public double getWeight() {
		return this.weight;
	}
	private double setStepLenght() {
		return this.stepLenght=Math.random();
	}
	public double getStepLenght() {
		return this.stepLenght;
	}
	public double moveStep(double move) {
		return this.distance=distance+(move*stepLenght);
	}
	public double getDistance() {
		return this.distance;
	}
	public void print(){
		System.out.printf("Pokemon name\t: %s \n",getName());
		System.out.printf("Pokemon type\t: %s \n",getType());
		System.out.printf("Weight\t\t: %.2f kg \n",getWeight());
		System.out.printf("Steplength\t: %.2f m \n",getStepLenght());
		System.out.printf("Distance\t: %.2f m \n",getDistance());
		System.out.println("------------------------------------------");
	}
	public void eat(){
		weight++;
	}
	private void setMood() {
		this.mood=Math.random();
	}
	public double getMood() {
		return this.mood;
	}

}
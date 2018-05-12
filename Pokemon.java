abstract public class Pokemon {
	public final double maxHealth;
	private String name;
	private String type;
	private double health;
	private double weight;
	protected double stepLenght;
	protected double distance;
	private double mood;
	public Pokemon(String name,String type){
		this.name=name;
		this.type=type;
		this.maxHealth=Math.random()*1000;
		this.health=maxHealth;
		this.weight=Math.random()*10;
		this.stepLenght=Math.random();
		this.mood=Math.random();
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
	public double getWeight() {
		return this.weight;
	}
	public double getStepLenght() {
		return this.stepLenght;
	}

	public double getDistance() {
		return this.distance;
	}

	public double getMood() {
		return this.mood;
	}
	public void print(){
		System.out.printf("Pokemon name\t: %s \n",getName());
		System.out.printf("Pokemon type\t: %s \n",getType());
		System.out.printf("Weight\t\t: %.2f kg \n",getWeight());
		System.out.printf("Steplength\t: %.2f m \n",getStepLenght());
		System.out.printf("Distance\t: %.2f m \n",getDistance());
		System.out.println("------------------------------------------");
	}
	public void eat(Berry berry){
		this.health += berry.getRestoreValue();
		if(this.health > this.maxHealth)
			this.health = this.maxHealth;
		this.weight++;
	}
	public void reducedHealth(double value){
		this.health -= value;
		if(this.health < 0)
			this.health = 0;
	}
	abstract public void move();

}
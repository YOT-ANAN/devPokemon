
public class Pikachu extends Pokemon implements Runnable{

	public Pikachu(String name,String type) {
		super(name, type);
		// TODO Auto-generated constructor stub
	}
	public void skill_IronTail() {
		System.out.println("Iron Tail!!!");
	}
	public void run() {
		this.distance=+stepLenght;
		this.reducedHealth(10);
	}
	public void move(){
		this.run();
	}


}

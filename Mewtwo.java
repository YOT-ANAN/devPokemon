
public class Mewtwo extends Pokemon implements Runnable {

	public Mewtwo(String name,String type) {
		super(name, type);
	}
	public void run() {
		this.distance=+stepLenght;
		this.reducedHealth(10);
	}
	public void move(){
		this.run();
	}
}


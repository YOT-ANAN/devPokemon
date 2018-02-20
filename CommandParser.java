import java.util.Scanner;

public class CommandParser {
	private Scanner sc;
	private PokemonFarm pokemonFarm;
	private boolean isRunning;
	public CommandParser() {
		sc=new Scanner(System.in);
		pokemonFarm = new PokemonFarm();
		isRunning = false;
	}
	public void run() {
		String command ;
		isRunning = true;
		System.out.println("Hello Pokemon Trainer");
		while(isRunning) {
			System.out.print("\nWhat do you want? :");
			command=sc.nextLine();
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
			}
			else if(command.equals("add")) {
				this.addPokemon();
			}
			else if(command.equals("list")) {
				this.listPokemon();
			}
			else if(command.equals("feed")) {
				this.feedPokemon();
			}
			else if(command.equals("move")) {
				this.movePokemon();
			}
		
		
		}
	}
	private void addPokemon() {
		String pokemonType ;
		String name ;
		System.out.print("Please select your PokemonType:");
		pokemonType=sc.nextLine();
		System.out.print("Please create your PokemonName:");
		name=sc.nextLine();
		
		if(pokemonType.equals("Mewtwo")){
			Mewtwo mewtwo = new Mewtwo(name,pokemonType);
			pokemonFarm.addPokemon(mewtwo);
		}
		else if(pokemonType.equals("Pikachu")) {
			Pikachu pikachu = new Pikachu(name,pokemonType);
			pokemonFarm.addPokemon(pikachu);	
		}
	}
	private void listPokemon() {
		System.out.println("===============================");
		System.out.printf("\tPokemon\n");
		System.out.println("===============================");
		pokemonFarm.list();
	}
	private void feedPokemon(){
		System.out.print("Which pokemon do you want to feed? : ");
		this.pokemonFarm.feed(this.sc.next());
		sc.nextLine();
		
	}
	private void movePokemon() {
		System.out.print("Which pokemon  do you want to move? : ");
		String name = this.sc.next();
		System.out.print("Number of step:");
		double step=this.sc.nextDouble();
		this.pokemonFarm.move(name,step);
		sc.nextLine();

	}


}

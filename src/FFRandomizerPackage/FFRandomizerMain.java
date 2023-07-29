package FFRandomizerPackage;

public class FFRandomizerMain {

	public static void main(String[] args) {
		FFRandomizer ff = new FFRandomizer();
		
		System.out.println("Welcome to the Final Fantasy 1 Randomizer.");
		System.out.println("");
		
		//Use our methods to get our randomized teams, incentives, and exp/gold slider.
		ff.teamRandomizer();
		ff.incentivesRandomizer();
		ff.expGoldRandomizer();
		
		System.out.println("");
		System.out.println("Enjoy the game and best of luck!");
		System.exit(0);
	}
}

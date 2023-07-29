package FFRandomizerPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class FFRandomizer {

	private Random rand = new Random();
	private final static int TEAM_SIZE = 4;
	private ArrayList<String> incentiveList = new ArrayList<String>();
	
	//Randomly picks whether each place is incentivized with treasure or not.
	public void incentivesRandomizer() {
		int index = 0;		
		//Fill our ArrayList with the incentives.
		populateIncentiveList();
		
		//Use an iterator to iterate through our ArrayList with a 50% chance of removing the incentive if the RNG results in 0.
		Iterator<String> itr = incentiveList.iterator();
		while (itr.hasNext()) {
			itr.next();
			if(rand.nextInt(2) == 0) {
				itr.remove();
			}					
		}				
		//Print out our incentivized locations 
		System.out.println("Incentivized Locations are:");
		System.out.println("---------------------------");		
		//Advanced for loop to print out the contents of our String ArrayList.
		for(String incentive : incentiveList) {
			System.out.println(incentive);
		}
		
		System.out.println("");
	}	
	
	//Method that randomly picks 4 team members and adds them to our team ArrayList, and returns our list of 4 team members.
	public void teamRandomizer() {
		
		ArrayList<String> team = new ArrayList<String>();
		int charChoice = 0;
		
		for (int i = 0; i < TEAM_SIZE; i++) {
			charChoice = rand.nextInt(12);
			
			switch(charChoice) {
				case 0: team.add("Fighter");
					break;
				case 1: team.add("Thief");
					break;
				case 2: team.add("Black Mage");
					break;
				case 3: team.add("White Mage");
					break;
				case 4: team.add("Red Mage");
					break;
				case 5: team.add("Ninja");
					break;
				case 6: team.add("Black Belt");
					break;
				case 7: team.add("Grandmaster");
					break;
				case 8: team.add("Warrior");
					break;
				case 9: team.add("Red Wizard");
					break;
				case 10: team.add("White Wizard");
					break;
				case 11: team.add("Black Wizard");
					break;
			}
		}		
		System.out.println("Your randomized heroes are:");
		System.out.println("---------------------------");
		
		for (String chars : team) {
			System.out.println(chars);
		}
		System.out.println("");
	}
	
	//Return a number from 0-10 on where to put the experience and gold slider.
	public void expGoldRandomizer() {
		int slider = rand.nextInt(11);
		System.out.println("Experience and Gold Slider: " + slider);
		System.out.println("");
	}
	
	//Populates our incentive list with the locations in game.
	private void populateIncentiveList() {
		incentiveList.add("Marsh Cave");
		incentiveList.add("Matoya's Cave");
		incentiveList.add("Earth Cave");
		incentiveList.add("Volcano");
		incentiveList.add("Waterfall");
		incentiveList.add("Sunken Shrine");
		incentiveList.add("Temple of Chaos");
		incentiveList.add("Titan's Cave");
		incentiveList.add("Ice Caverns");
		incentiveList.add("Mirage Tower");
		incentiveList.add("Flying Fortress");
		incentiveList.add("Citadel of Trials");
		incentiveList.add("Sage's Cavern");
	}	
}

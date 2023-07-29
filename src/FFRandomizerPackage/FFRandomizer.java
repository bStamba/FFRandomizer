package FFRandomizerPackage;

import java.util.ArrayList;
import java.util.Random;

public class FFRandomizer {

	private Random rand = new Random();
	private final static int TEAM_SIZE = 4;
	private ArrayList<String> incentiveList = new ArrayList<String>();
	
	//Randomly picks whether each place is incentivized with treasure or not.
	public void incentivesRandomizer() {
		int index = 0;
		populateIncentiveList();
		
		//Regular for loop.
		for(int i = 0; i < incentiveList.size(); i++) {
			if(rand.nextInt(1) == 0) {
				incentiveList.remove(index);
				index--;
			}
		}		
		/*
		//Advanced for loop.
		for(String incentive : incentiveList) {
			if(rand.nextInt(1) == 0) {
				incentiveList.remove(incentive);
			}
		}
		*/
		System.out.println("Incentivized Locations are:");
		System.out.println("---------------------------");
		
		for(String incentive : incentiveList) {
			System.out.println(incentive);
		}
	}	
	
	//Method that randomly picks 4 team members and adds them to our team ArrayList, and returns our list of 4 team members.
	public void teamRandomizer() {
		
		ArrayList<String> team = new ArrayList<String>();
		int charChoice = 0;
		
		for (int i = 0; i < TEAM_SIZE; i++) {
			charChoice = rand.nextInt(11);
			
			switch(charChoice) {
				case 0: team.add("Fighter");
				case 1: team.add("Thief");
				case 2: team.add("Black Mage");
				case 3: team.add("White Mage");
				case 4: team.add("Red Mage");
				case 5: team.add("Ninja");
				case 6: team.add("Black Belt");
				case 7: team.add("Grandmaster");
				case 8: team.add("Warrior");
				case 9: team.add("Red Wizard");
				case 10: team.add("White Wizard");
				case 11: team.add("Black Wizard");
			}
		}		
		System.out.println("Your randomized heroes are:");
		System.out.println("---------------------------");
		
		for (String chars : team) {
			System.out.println(chars);
		}
	}
	
	//Return a number from 0-10 on where to put the experience and gold slider.
	public void expGoldRandomizer() {
		int slider = rand.nextInt(10);
		System.out.println("Experience and Gold Slider: " + slider);
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

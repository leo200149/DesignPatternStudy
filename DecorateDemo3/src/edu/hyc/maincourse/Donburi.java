package edu.hyc.maincourse;
import edu.hyc.base.Food;


public class Donburi extends Food {
	
	public Donburi(){
		description = "Donburi";
		cost = 10;
		price = 30;
	}

	@Override
	public String getDescription() {
		return description;
	}
	
	@Override
	public int countCost() {
		return cost;
	}

	@Override
	public int countPrice() {
		return price;
	}

}

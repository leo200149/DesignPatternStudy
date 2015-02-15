package edu.hyc.main;

import edu.hyc.base.Food;
import edu.hyc.maincourse.Donburi;
import edu.hyc.sidedish.Beef;
import edu.hyc.sidedish.PorkChop;
import edu.hyc.sidedish.Salmon;

public class Restaurant {

	public static void main(String[] args) {
		Food meals1 = new Donburi();
		meals1 = new Beef(meals1);
		printFoodData(meals1);

		Food meals2 = new Donburi();
		meals2 = new Salmon(meals2);
		meals2 = new PorkChop(meals2);
		printFoodData(meals2);

		Food meals3 = new Donburi();
		meals3 = new Beef(meals3);
		meals3 = new Salmon(meals3);
		meals3 = new PorkChop(meals3);
		printFoodData(meals3);
	}
	
	public static void printFoodData(Food food){
		System.out.println(food.getDescription() + " cost:"
				+ food.countCost() + ",price:" + food.countPrice());
	}

}

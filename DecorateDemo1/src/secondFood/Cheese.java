package secondFood;

import base.Food;
import base.SecondFood;

public class Cheese implements SecondFood {

	private Food food;

	private final String description = "Cheese";

	private final int price = 10;

	public Cheese(Food food) {
		this.food = food;
	}

	public String getDescription() {
		String desc = "";
		desc += description;
		if (food != null) {
			desc += food.getDescription();
		}
		return desc;
	}

	public int getPrice() {
		int price = 0;
		price += this.price;
		if (food != null) {
			price += food.getPrice();
		}
		return price;
	}
}
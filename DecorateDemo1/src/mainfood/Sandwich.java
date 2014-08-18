package mainfood;

import base.Food;

public class Sandwich implements Food {

	private final String description = "Sandwich";

	private final int price = 15;

	public String getDescription() {
		return description;
	}

	public int getPrice() {
		return price;
	}

}

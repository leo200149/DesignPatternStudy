import mainfood.Sandwich;
import secondFood.Cheese;
import secondFood.Egg;
import secondFood.Ham;
import base.Food;

public class Main {
	public static void main(String[] args) {
		Food food = null;
		food = new Sandwich();
		food = new Egg(food);
		food = new Cheese(food);
		food = new Ham(food);
		System.out.println(food.getDescription() + ",cost:" + food.getPrice());
	}
}

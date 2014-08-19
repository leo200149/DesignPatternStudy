package factory;

import item.newyork.NYBeefPizza;
import item.newyork.NYSeafoodPizza;
import base.Pizza;
import base.PizzaFactory;
/**
 * 紐約比薩工廠
 * @author Leo_Chen
 *
 */
public class NewYorkPizzaFactory extends PizzaFactory {

	@Override
	protected Pizza createPizza(PIZZATYPE pizzaType) {
		Pizza pizza = null;
		if(pizzaType == PIZZATYPE.BEEF){
			pizza = new NYBeefPizza();
		}else if(pizzaType == PIZZATYPE.SEAFOOD){
			pizza = new NYSeafoodPizza();
		}
		return pizza;
	}

}

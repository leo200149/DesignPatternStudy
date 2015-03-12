package factory;

import item.taipei.TPBeefPizza;
import item.taipei.TPSeafoodPizza;
import base.Pizza;
import base.PizzaFactory;
/**
 * 台北比薩工廠
 * @author Leo_Chen
 *
 */
public class TaipeiPizzaFactory extends PizzaFactory {

	@Override
	protected Pizza createPizza(PIZZATYPE pizzaType) {
		Pizza pizza = null;
		if(pizzaType == PIZZATYPE.BEEF){
			pizza = new TPBeefPizza();
		}else if(pizzaType == PIZZATYPE.SEAFOOD){
			pizza = new TPSeafoodPizza();
		}
		return pizza;
	}

}

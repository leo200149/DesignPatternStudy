import base.Pizza;
import base.PizzaFactory;
import base.PizzaFactory.PIZZATYPE;
import factory.NewYorkPizzaFactory;
import factory.TaipeiPizzaFactory;


public class Main {

	public static void main(String[] args) {
		String people1 = "Leo";
		String people2 = "Billy";
		System.out.println(people1+ " want to buy New York-style pizza ");
		System.out.println(people2+ " want to buy Taipei-style pizza ");
		
		PizzaFactory callFactory = null;
		
		
		//紐約比薩工廠
		callFactory = new NewYorkPizzaFactory();
		//紐約風味海鮮比薩
		Pizza nySeafoodPizza= callFactory.orderPizza(PIZZATYPE.SEAFOOD);
		System.out.println(people1 + " get:"+nySeafoodPizza.getDescription());
		//紐約風味牛肉比薩
		Pizza nyBeefPizza=callFactory.orderPizza(PIZZATYPE.BEEF);
		System.out.println(people1 + " get:"+nyBeefPizza.getDescription());
		
		//台北比薩工廠
		callFactory = new TaipeiPizzaFactory();
		//台北風味牛肉比薩
		Pizza tpBeefPizza= callFactory.orderPizza(PIZZATYPE.BEEF);
		System.out.println(people2 + " get:"+tpBeefPizza.getDescription());
		//台北風味海鮮比薩
		Pizza tpSeafoodPizza=callFactory.orderPizza(PIZZATYPE.SEAFOOD);
		System.out.println(people2 + " get:"+tpSeafoodPizza.getDescription());
	}

}

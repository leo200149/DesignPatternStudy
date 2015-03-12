package base;
/**
 * 比薩工廠
 * 
 * 工廠方法
 * 定義了統一的商品物件介面，
 * 並在工廠超類別定義了用以取得商品物件的抽象方法，
 * 由工廠次類別實作決定創建何種商品物件實體。 
 * 
 * 決定了工廠就等於決定了會取得的商品物件。
 * @author Leo_Chen
 *
 */
public abstract class PizzaFactory {
	
	public enum PIZZATYPE{
		BEEF,SEAFOOD;
	}
	
	public Pizza orderPizza(PIZZATYPE pizzaType){
		System.out.println(getClass()+" start to prepaidPizza");
		Pizza pizza = createPizza(pizzaType);
		pizza.prepaid();
		pizza.baking();
		return pizza;
	}
	
	protected abstract Pizza createPizza(PIZZATYPE pizzaType);
}

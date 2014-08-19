package factory;

import item.Duck;
import item.NormalDuck;
import item.PetDuck;
import item.SuperDuck;

/**
 * 簡單鴨子工廠
 * @author Leo_Chen
 *
 */
public class SimpleDuckFactory {
	
	/**
	 * 取得鴨子
	 * @param event
	 * @return
	 */
	public Duck getDuck(EVENT event){
		Duck duck = null;
		if(event ==EVENT.HELP){
			duck = new SuperDuck();
		}else if(event == EVENT.PET){
			duck = new PetDuck();
		}else if(event==EVENT.NORMAL){
			duck = new NormalDuck();
		}
		return duck;
	}
	
	public enum EVENT{
		HELP,PET,NORMAL;
	}
	
}

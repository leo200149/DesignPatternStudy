package customer;

import factory.SimpleDuckFactory;
import factory.SimpleDuckFactory.EVENT;
import item.Duck;
import item.NormalDuck;
import item.PetDuck;
import item.SuperDuck;

import java.util.ArrayList;
import java.util.List;
/**
 * 鴨子湖
 * 
 * 簡單工廠與其稱呼為設計模式，
 * 不如說是一種coding習慣
 * 將產生物件的邏輯，另外用一個方法或類別封裝起來
 * 程式碼流程及結構會更加清楚，
 * 而若邏輯需要變更，僅需更改該方法或類別，
 * 同時也方便重複使用。
 *  
 * @author Leo_Chen
 */
public class DuckLake {
	
	/**
	 * 鴨子群
	 */
	private List<Duck> ducks;
	
	/**
	 * 建立鴨子湖
	 */
	public void createDuckLack() {
		ducks = new ArrayList<Duck>();
		ducks.add(getDuck(EVENT.NORMAL));
		SimpleDuckFactory duckFactory = new SimpleDuckFactory();
		for(int i=0;i<10;i++){
			ducks.add(duckFactory.getDuck(EVENT.NORMAL));
		}
		ducks.add(duckFactory.getDuck(EVENT.HELP));
		ducks.add(duckFactory.getDuck(EVENT.PET));
	}
	
	/**
	 * 簡單工廠 取得鴨子
	 * @param event
	 * @return
	 */
	private Duck getDuck(EVENT event){
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
	
	/**
	 * 展現所有鴨子
	 */
	public void showAllDucks(){
		for(Duck duck: ducks){
			System.out.println(duck.getName()+"["+duck.getDescription()+"]");
		}
	}
	
}

package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 鋼鐵人
 * @author Leo_Chen
 *
 */
public class Ironman implements Observer{
	
    public void gogo(){
        System.out.println("Ironman gogo!!");
    }
	@Override
	public void update(Observable o, Object arg) {
        System.out.println("Ironman receive world's message:"+arg.toString()); 
        gogo();
	}
}

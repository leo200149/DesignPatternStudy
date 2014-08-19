package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 蜘蛛人
 * @author Leo_Chen
 *
 */
public class Spiderman implements Observer{
    public void nothing(){
        System.out.println("Spiderman zzz...");
    }
	@Override
	public void update(Observable o, Object arg) {
        System.out.println("Spiderman receive world's message:"+arg.toString());   
        nothing();  
	}
}

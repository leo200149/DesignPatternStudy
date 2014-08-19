package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 外星人
 * @author Leo_Chen
 *
 */
public class Alien implements Observer{
	@Override
	public void update(Observable o, Object arg) {
        System.out.println("Alien receive world's message:"+arg.toString());   
        hahaha();
	}
    public void hahaha(){
        System.out.println("Alien hahaha!!");
    }
}

package observer;

import java.util.Observable;
import java.util.Observer;

import subject.WorldSubject;

/**
 * 蜘蛛人
 * @author Leo_Chen
 *
 */
public class Spiderman implements Observer{
	
	private String message;
	
    public void doSomething(){
        System.out.println(message);
    }
	@Override
	public void update(Observable o, Object arg) {
		if(arg!=null){
			message = "PUSH......";
			System.out.println(message + "Spiderman receive world's message:"+arg.toString());
	        message += "Ironman fight now";			
		}else{
			message = "PULL......";
			if(o instanceof WorldSubject){
				message += "Spiderman get " + ((WorldSubject) o).getPower();
			}else{
				message += "Spiderman is sleeping";
			}
		}
		doSomething();
	}
}

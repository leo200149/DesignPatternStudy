package observer;

import java.util.Observable;
import java.util.Observer;

import subject.WorldSubject;

/**
 * ¥~¬P¤H
 * @author Leo_Chen
 *
 */
public class Alien implements Observer{
	
	private String message;
	
    public void doSomething(){
        System.out.println(message);
    }
	@Override
	public void update(Observable o, Object arg) {
		if(arg!=null){
			message = "PUSH......";
			System.out.println(message + "Alien receive world's message:"+arg.toString());
	        message += "Alien hahaha";			
		}else{
			message = "PULL......";
			if(o instanceof WorldSubject){
				message += "Alien escape";
			}else{
				message += "Alien is sleeping";
			}
		}
		doSomething();
	}
}

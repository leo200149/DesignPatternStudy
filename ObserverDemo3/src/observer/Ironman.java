package observer;

import java.util.Observable;
import java.util.Observer;

import subject.WorldSubject;

/**
 * 鋼鐵人
 * @author Leo_Chen
 *
 */
public class Ironman implements Observer{
	
	private String message;
	
    public void doSomething(){
        System.out.println(message);
    }
	@Override
	public void update(Observable o, Object arg) {
		if(arg!=null){
			message = "PUSH......";
			System.out.println(message + "Ironman receive world's message:"+arg.toString());
	        message += "Ironman fight now";			
		}else{
			message = "PULL......";
			if(o instanceof WorldSubject){
				message += "Ironman get " + ((WorldSubject) o).getPower();
			}else{
				message += "Ironman is sleeping";
			}
		}
		doSomething();
	}
}

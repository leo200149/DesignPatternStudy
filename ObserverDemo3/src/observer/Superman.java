package observer;

import java.util.Observable;
import java.util.Observer;

import subject.WorldSubject;

/**
 * 超人
 * @author Leo_Chen
 *
 */
public class Superman implements Observer {
	
	private String message;
	
    public void doSomething(){
        System.out.println(message);
    }
	@Override
	public void update(Observable o, Object arg) {
		if(arg!=null){
			message = "PUSH......";
			System.out.println(message + "Superman receive world's message:"+arg.toString());
	        message += "Superman fight now";			
		}else{
			message = "PULL......";
			if(o instanceof WorldSubject){
				message += "Superman get " + ((WorldSubject) o).getPower();
			}else{
				message += "Superman is sleeping";
			}
		}
		doSomething();
	}
}

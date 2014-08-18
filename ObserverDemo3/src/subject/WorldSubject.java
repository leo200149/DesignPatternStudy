package subject;

import java.util.Observable;


/**
 * 世界 (被觀察者)
 * 
 * @author Leo_Chen
 * 
 */
public class WorldSubject extends Observable {


    private String message;
    private String power;

    /**
     * 有事件發生，提醒所有觀察者
     * 
     * @param message
     */
    public void haveProblem(String message) {
        this.message = message;
        setChanged();
        notifyObservers(this.message);
    }
    
    public void worldWillDestroy(){
    	System.out.println("The world will destroy......");
        setChanged();
        notifyObservers();    	
    }
    
    public String getPower(){
    	return this.power;
    }

    public void setPower(String power){
    	this.power = power;
    }
}
package subject;

import java.util.Observable;


/**
 * 世界(主題)
 * 
 * @author Leo_Chen
 * 
 */
public class WorldSubject extends Observable {


    private String message;
    private String power;

    /**
     * 有狀況
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
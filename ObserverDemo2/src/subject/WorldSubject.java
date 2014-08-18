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

    /**
     * 有事件發生，提醒所有觀察者
     * 
     * @param message
     */
    public void haveProblem(String message) {
        this.message = message;
        setChanged();
        System.out.println("------------------------------");
        notifyObservers(this.message);
        System.out.println("------------------------------");
    }
}
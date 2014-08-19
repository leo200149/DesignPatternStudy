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

    /**
     * 有狀況
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
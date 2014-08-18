package subject;

import java.util.ArrayList;
import java.util.List;

import base.Observer;
import base.Subject;

/**
 * 世界 (被觀察者)
 * 
 * @author Leo_Chen
 * 
 */
public class WorldSubject implements Subject {

    private List<Observer> observerList;

    private String message;

    public WorldSubject() {
        observerList = new ArrayList<Observer>();
    }

    public void registOberserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeOberserver(Observer observer) {
        if (observerList.indexOf(observer) > -1)
            observerList.remove(observer);
    }

    public void notifyAllOberserver() {
        for (Observer observer : observerList) {
            observer.receiveNotify(message);
        }
    }

    /**
     * 有事件發生，提醒所有觀察者
     * 
     * @param message
     */
    public void haveProblem(String message) {
        this.message = message;
        System.out.println("------------------------------");
        notifyAllOberserver();
        System.out.println("------------------------------");
    }
}
package observer;

import base.Observer;
/**
 * 鋼鐵人
 * @author Leo_Chen
 *
 */
public class Ironman implements Observer{
    public void receiveNotify(String message){
        System.out.println("Ironman receive world's message:"+message); 
        gogo();     
    }
    public void gogo(){
        System.out.println("Ironman gogo!!");
    }
}

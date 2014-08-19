package observer;

import base.Observer;
/**
 * 蜘蛛人
 * @author Leo_Chen
 *
 */
public class Spiderman implements Observer{
    public void receiveNotify(String message){
        System.out.println("Spiderman receive world's message:"+message);   
        nothing();      
    }
    public void nothing(){
        System.out.println("Spiderman zzz...");
    }
}

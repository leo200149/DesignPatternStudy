import observer.Alien;
import observer.Ironman;
import observer.Spiderman;
import observer.Superman;
import subject.WorldSubject;
import base.Observer;

/**
 * 測試
 * @author Leo_Chen
 *
 */
public class Main {
    
    public static void main(String[] args){
        /*
         * 世界
         */
        WorldSubject world = new WorldSubject();
        /*
         * 超人們
         */
        Superman superman = new Superman();
        Spiderman spiderman = new Spiderman();
        Ironman ironman = new Ironman();
        Alien alien = new Alien();
        /*
         * 跟世界註冊為英雄，當有事件發生時世界會通知他們。
         */
        registHeroAndBadMan(world,superman);
        registHeroAndBadMan(world,spiderman);
        registHeroAndBadMan(world,ironman);
        registHeroAndBadMan(world,alien);
        /*
         * 世界發生了事件
         */
        world.haveProblem("Snooppy is too Fat!");
        world.haveProblem("Andy's toys disappear!");
        world.haveProblem("Bomb!!AAAAAAAAA!");
        
        /*
         * 鋼鐵人GG了
         */
        manDied(world,ironman);

        /*
         * 世界發生了事件
         */
        world.haveProblem("God! please help me!");
    }
    
    public static void registHeroAndBadMan(WorldSubject world,Observer man){
        world.registOberserver(man);
    }
    public static void manDied(WorldSubject world,Observer man){
    	System.out.println(man.getClass()+" died!! remove from world observer");
        world.removeOberserver(man);
    }
}

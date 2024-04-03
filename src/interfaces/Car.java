 package interfaces;
/*
 this is a class which is implementing three interfaces 
 1.Engine-interface: powerengine->class and electricengine->class implementig engine interface
 2.brake->interface:
 3:Media->interface:CDplayer ->class implementing media
 */
public class Car implements Engine, Brake, Media{

    int a = 30;

    @Override
    //brake from brake
    public void brake() {
        System.out.println("I brake like a normal Car");
    }

    @Override
    //start from engine
    public void start() {
        System.out.println("I start engine like a normal Car");
    }
//stop from engine
    @Override
    public void stop() {
        System.out.println("I stop engine like a normal Car");
    }
//acc from engine
    @Override
    public void acc() {
        System.out.println("I accelerate like a normal Car");
    }
}
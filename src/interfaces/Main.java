package interfaces;

public class Main {
    public static void main(String[] args) {
    /*       Engine car = new Car();->engine->interface,car()->car class
    this line creates an instace of the car class and assigns it to the variable 
    car of type engine->car implements engine interface->treaing car object as an engine
    which means only the method defined in the engine are accessable
    */    


//      car.a;->this can caue an error,because a is not defined in the engine it is defined in the car
//        car.acc();
//        car.start();
//        car.stop();
//        Media carMedia = new Car();
//        carMedia.stop();


        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
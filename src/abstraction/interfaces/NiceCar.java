package interfaces;

public class NiceCar {
    //private Engine engine;: This variable is used to hold an instance of 
    //an object that implements the Engine interface 
    //It's a reference to the engine of the car
    private Engine engine;
    /*his variable is used to hold an instance of an object that implements the Media 
    interface or extends a class that implements the Media interface.
     It's a reference to the media player
     of the car, initialized with a CDPlayer object by default. */
    private Media player = new CDPlayer();

    public NiceCar() {
        // It initializes the engine instance variable with a PowerEngine object 
        //PowerEngine is a class that implements or extends the Engine interface
        engine = new PowerEngine();
    }
// This constructor takes an Engine object as a parameter.
    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    //below tow function ,start and stop from engine
    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }
//below two fucntions from player
    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElecticEngine();
    }
}

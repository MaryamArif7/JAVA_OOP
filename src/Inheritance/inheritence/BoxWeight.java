package inheritence;
/*NOTES :
 * ->ArrayList<int> intList = new ArrayList<>(); // This is invalid
  -> ArrayList<Integer> intList = new ArrayList<>(); // This is valid
->integer is the wrapper class for int ,in collections only non-primitives (refrence type including wrapper )
can be used as generic type paramerter,
->to pass the primitve we need to make it wrap in wrapper class 
like this; 
int primitiveInt = 10;
Integer wrappedInt = new Integer(primitiveInt);
ArrayList<Integer> integerList = new ArrayList<>();
integerList.add(10); // Here, 10 is automatically wrapped into an Integer object

 */
import java.util.ArrayList;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = 1;
    }

//    @Override
    static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
        ArrayList list = new ArrayList();
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        /*
         Super;
         ->cann use super to override the methods or variavbles of the parent class
         ->when we craete  an object for the child class, this also creates object for parent class implcitly
         and child is inherired so to acces to parent we need to intialize parent class constructor too
         so to do that use super.
         ->so java does not call parent class constructor automatically from the child class,if dont use super
         it will call the  constructor of parent class wit no parameter automtically,,so to access the 
         parent class constructor with parameters we need to use super and pass pass the arguments 

         */
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        // used to initialise values present in parent class
        super(l, h, w); // what is this? call the parent class constructor
//        System.out.println(super.weight);
        this.weight = weight;
    }

}
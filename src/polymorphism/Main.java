package polymorphism;
/*Polymorphism:
->polymorphism refers to the ability of different objects to repsond to the same method in different way.
->it allows objects of different classes to be treated as objects of common superclass 
Types:
1.compile-time(static binding)->method overloading.
->in the same class ,when mutiple method has same name but diferent params
2.Run time polymorphism(dynamic)->overiding
->when a  method  in a subclass has the type,name,everthing  is the same as the superclass then the method in the sunclass gets overide
if they are not same exactly,then the method is overloaded not overiden
->which method to call is decided on run time on the basis of object's type
IT IS THE TYPE OF OBJECT BEING REFFERD TO (NOT THE REF VARI) THAT DETERMINES WHICH VERSION TO CALL AT RUN TIME
->DIPATCH DECIDES ->JVM DETERMINES AT RUNTIME
IMPORTANT-> A SUPERCLASS REF. VARIABLE,CAN REFER TO SUBCLASS OBJECT
TYPE OF OBJECT-> IT IS DETERMIND BY ITS CLASS ,EVERY OBJECT BELONGS TO A SPECIFIC CLASS,
THAT CLASS DEINES THE TYPE OF THE OBJECT->CAR ->CLASS-> OBJECT TYPE OF CAR CLASS IS CAR
               |



 */
public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        //the circle class is extends shapes class, it has two methods of same
        //name->area() ,below:
        // circle is refrence var of type Shapes
        //object is circle of type circle(class)
        //so the area method of circle is called ,not of the shapes class.
        Shapes circle = new Circle();
        Shapes square = new Square();

        circle.area();
    }
}
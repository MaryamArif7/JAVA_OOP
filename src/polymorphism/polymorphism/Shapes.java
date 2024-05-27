package polymorphism;

public class Shapes {
    void area() {
        System.out.println("I am in shapes");
    }

// Early binding->when kyword final is used with a method then java knows it can not be overriden , 
//so the call is resolved at compile time->early binding
//late binding->when java resolves calls to methods dynamically at run time->late binding. 
//the method with final keyword can not be overided by its subclasses
//Final:1:final classes->cant not be subclassed/can not be extend
//2:final methods->can not be overidden
//3.final variable->final value can not be changed after intialization
//t can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only. 

// final void area() {
//        System.out.println("I am in shapes");
//    }
}

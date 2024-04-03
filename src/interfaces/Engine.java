package interfaces;
/*INTERFACES LETS GET IT  
 -> is a refrence type,only contain constants,methods,static methods 
 ->but not containa any implemention, means tells what to do but not how to do
 ->allows mutliple interfaces
 ->any method in interface is public and abstarct->meaning they have no implementation
 and must be overriden by the class implementing interface
 ->interfafce can have ->1.abstarct method(witout body)->needs to be override 
                       ->2.default metodd with body
                       ->static method with the body (can be called without the need of instance of implementing class)
->no instance variable
                    no need of instance variable,because,interface only have implemention 
                    of the metods ,these metods are follow by other classes
->by default interface and methds inside it are public.
->the varaibles must be final and static->intialize on the spot->known as constants
   why ?
->public: Interface constants should be accessible to all classes that use the interface. By default, 
interface members are public, ensuring they are accessible from any class that implements the interface.   
->static: Interface constants are shared among all instances of classes that implement the interface. By making them static,
 they belong to the class itself rather than any particular instance, allowing them to
 be accessed without needing an instance of the implementing class.
->inal: Interface constants should not be modified after they are initialized. 
By making them final, their values cannot be changed once they are assigned, ensuring their immutability.
 
*/

public interface Engine {
//constant
    static final int PRICE = 78000;

    void start();
    void stop();
    void acc();
}

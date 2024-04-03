package abstractDemo;
/*
abstract class:
->this can not be instanited meaning we cant create its objects directly,but can u
with subclasses that are extended by the absreact class
->a class having one or more abstract method is abstract class
->abdtst method dont have any implementation
->it can have abstract methods ,static methhods and default methods
->can have instance variables,final variables
->canhave constructor ,subclasses can class this constructor using super
 abstract class obly support multilevel inheritence
 */
public abstract class Parent {

    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 32456789;
    }

    static void hello(){
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();
}
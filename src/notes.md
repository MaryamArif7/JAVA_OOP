
      -----non primitves----
->Non Primitve type also knowns as refernce type becuse they refer to objs
->primitve are predefined while non primitve are creted by ourselves
->String is a class in the java.lang package.
->Being a class, String objects are instances of the String class.
->Strings in Java are immutable, meaning once a String object is created, its value cannot be changed.
Any modification to a String results in the creation of a new String object.
public class Main {
    public static void main(String[] args) {
        // Using string literals
        String str1 = "Hello, World!";
        
        // Using the new keyword
        String str2 = new String("Hello, World!");
        
        // Checking if the two strings are the same object
        System.out.println(str1 == str2); // false
        
        // Checking if the two strings have the same value
        System.out.println(str1.equals(str2)); // true
    }
}
 ->assignment operator->in the above example they both are treated as different instance so they are not equal
 ->while with .equal thy are equal
------static with functions-----
static method:
belong to the class ,no to the instance,so can be called without beion createing the instance
->only can access other varaibles and method who are static ,but cannot acess the the non static directly.

-----inside of static -----
->inside of static method we can not acess the insatnce fields,
->to acess the static metod inside of static method just call the method with class name .     Example.staticMethod();
here Example is the class name.
->to call the non staic inside of the staic use new keyword and create an instance then call the non static using the obj of that class.
-----inside of non static----
->can acess the static method

        // Can access static methods
        staticMethod();
->can acess the insatnce variables and oter instance methods directly.
    // Calling another instance method
        introduce();
        birthday();
        access static members (both methods and variables) inside non-static (instance) methods. This is because static members belong to the class itself, and any instance of the class can refer to the class-level members.
------static variables-----
->shared among the all the instnces of the class
-only one copy created in the class
other-----
->confusions:
to acess static inside of static use Example.static().Example is classname
to acess non staic or static inside of non static ,call directlty/

-> Class variable is always resolved during compile time whereas, instance variable is resolved during the runtime.
->if we want updateb the static value ,and acesssing it inside of static to update the member we can ,but if do in the contructor then we can do it but only if we have called that constuctor
-> we cannot declare a static method and instance method with the same signature in the same class.
->the interface allows to define a static method with body.
->this and super keywords are not allowed inside the static region.
-> we can overload static methods but override them. This is because they are bound with class, not instance.
->we cannot override static methods because static methods belong to a class, not individual objects, and are resolved at compile time by java compiler.
->When the dot class file is loaded into memory, static block is executed. After executing the static block, JVM calls the main method to start execution. Therefore, static block is executed before the main method.
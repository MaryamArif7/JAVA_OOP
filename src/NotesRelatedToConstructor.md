class A {
void m1(A a) {
    System.out.println("m1 method in class A");	 
 }
}
class B extends A {	
 public void m1(A a) {
    System.out.println("m1 method in class B");
 }
}
public class Test{
public static void main(String[] args){
 A a = new A();
 a.m1(a);
 /* ->An object is created when the new keyword is used with a constructor. For example, new A() creates an instance of class A and calls the constructor of A
 ->The constructor that gets called is determined by the class specified after the new keyword.
 -> The type of the reference variable determines what methods can be called on the object it references.
 ->the actual method that gets executed is determined by the runtime type of the object, not the reference type. This is known as runtime polymorphism or dynamic method dispatch.*/
 a.m1(new B());
 
 B b = new B();
 b.m1(null);
 a = b;
 a.m1(null);
 a.m1(new A());
  }
  in the above example  the output is :
m1 method in class A
m1 method in class A
m1 method in class B
m1 method in class B
m1 method in class B
 
->The type of the reference variable determines which methods can be called on the object, but the actual method that gets executed is determined by the runtime type of the object (the class of the actual object instance).Dynamic Dispatch:

When an overridden method is called through a superclass reference, Java determines which version of the method (superclass or subclass) to execute at runtime based on the actual object type
->Method Overloading: This occurs when multiple methods in the same class have the same name but different parameters (different signatures). The method to be called is determined at compile-time based on the method signature.
Method Overriding: This occurs when a subclass provides a specific implementation of a method already defined in its superclass. The method to be called is determined at runtime based on the actual object type, not the reference type.
->Method Call with Reference of Type A:
A a = new A();
a.m1(new B());
The reference type a is A, and the object type is also A.
The m1 method in A is called with new B() as an argument.
Output: One (because m1 in A is called).
->Method Call with Reference of Type A but Object of Type B:
A b = new B();
b.m1(null);
The reference type b is A, but the actual object type is B.
The method m1 in B overrides the method in A.
At runtime, the m1 method in B is called.
Output: Two (because m1 in B is called).
->Dynamic Dispatch: When you have a superclass reference pointing to a subclass object, the overridden method in the subclass is called at runtime.
Method Signature: In method overloading, the method to call is determined at compile-time based on the method signature. In method overriding, the method to call is determined at runtime based on the actual object type.
-----clearing few things----
   -> ArrayList<Integer> arr = new ArrayList<>();
     directly using the ArrayList class, which means you have access to methods specific to ArrayList that are not part of the List interface.
     ->List<Integer> arr = new ArrayList<>();
This line declares arr as a List of Integer, but initializes it with an ArrayList.
Here, arr is a reference of type List, which is an interface. The actual object is an instance of ArrayList.
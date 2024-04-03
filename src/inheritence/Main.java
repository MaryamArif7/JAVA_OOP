package inheritence;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 7.9, 9.9);
        box1.getL();
        Box box2 = new Box(box1);
/*      System.out.println(box1.w + " " + box1.h);
        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2, 3, 4, 8);
       System.out.println(box3.h + " " + box3.weight); */

/* 
-> Box box5 = new BoxWeight(2, 3, 4, 8);
   System.out.println(box5.w) -> this will give an error
->new creates a new instance of the BoxWeight of the class,
passing parameters to the its constructor.->this created an object in the memory and gets intialized   
->box5  is a refrence variable of type Box:
so what happens :
when we create an object using new ,java allocates memory on the heap to store object date 
                            THEN
->the box5 does not directly contain object data,but it contains a refrence(memory address) that 
points to the location of object in heap                               
                            THEN
-> Refrence variable is of type Box ,this means accrd. to its declared type 
only members defined in the box class can  be acssed using the refrence,
any other member specific to the boxweight can not be aceessed uising box refrence variable
ITS THE TYPE OF REFRENCE VARIABLE WHICH DETERMINES WHAT TO ACCESS NOT THE OBJECT TYPE
----->so
in this case contructor will be called of boxweight 
 to intialize but box5 will check box class for the member  
 ---->r, since box5 is declared as a reference variable of type Box, 
 it will only have access to members (fields and methods) that are defined in the 
 Box class or inherited from its superclasses. Even though the actual object being referred 
 to is of type BoxWeight, the compiler will restrict access 
 to only those members that are available in Box unless you perform a cast.
 ->Also parent does not know about its child 
   */

   /*there are many variables in both parent and child classes
    you are given access to variables that are in the ref type i.e. BoxWeight
  hence, you should have access to weight variable
  this also means, that the ones you are trying to access should be initialised
 but here, when the obj itself is of type parent class, how will you call the constructor of child class
this is why error 
BoxWeight box6 = new Box(2, 3, 4);
System.out.println(box6)
 Box.greeting(); */

        BoxWeight box = new BoxWeight();
        BoxWeight.greeting(); 
        // you can inherit but you cannot override
    }
}
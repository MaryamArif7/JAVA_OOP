package Singleton;

import acess.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        //nstead of new Singleton() ensures that only 
       // one instance of the Singleton class is created throughout the application's lifetime
        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();
       // Subsequent calls to getInstance() return the existing instance stored in the instance variable, without creating a new instance.
        // all 3 ref variables are pointing to just one object

        A a = new A(10, "Kunal");
        a.getNum();
//        int n = a.num;
    }
}
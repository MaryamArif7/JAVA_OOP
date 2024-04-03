package Singleton;

public class Singleton {
    //private constructor to prevent instantiation fro outsie f the class
    private Singleton () {

    }
/*
 * 
->private: This keyword specifies that the access level of the variable is restricted to the Singleton class itself.
 It cannot be accessed directly from outside the class
->static: This keyword declares that the instance variable
  belongs to the class itself rather than to instances of the class.
   It means there will be only one instance of instance shared among all instances of the Singleton class.
->The instance variable is static, meaning there is only one copy of it per class, regardless 
of how many instances of the class are created.
 
   */
    private static Singleton instance;

    public static Singleton getInstance() {
        // when it gets caled for the first time ever it will check whether 1 obj only is created or not
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

}
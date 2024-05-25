package Static;



public class Main {
    public static void main(String[] args) {
//        Human kunal = new Human(22, "Kunal", 10000, false);
//        Human rahul = new Human(34, "Rahul", 15000, true);
//        Human arpit = new Human(34, "arpit", 15000, true);
//population is static member of Human class
//we can acess static inside of static using clasName
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();

    }

    // this is not dependent on objects
    static void fun() {
             //greetin is non static so that need an object we do that by using new keyword
              // you cant use this because it requires an instance
              // can not make a static reference to the non-static method greeting() from the type Mai
             //  greeting();
             // but the function you are using it in does not depend on instances

             //  cannot access non static stuff without referencing their instances in
             // a static context

        //  we need  to referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        //can acess the non static inside of non static 
        greeting();
    }

    //  something which is not static, belongs to an object
    void greeting() {
        //fun() isa static method to acess fun which is static inside of non static we can call it
       // fun();
        System.out.println("Hello world");
    }
}
//for statc we cant use non static stuff like the this keyword can not  be useed for static function
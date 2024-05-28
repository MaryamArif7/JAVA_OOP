1.A simple example of a collection is given below:
     collection vs interface
// Create a container list of cities (objects or elements). 
   List<String> city = new ArrayList<String>();

// Adding names of cities.
   city.add(“New York”);
   city.add(“Dhanbad”);
   city.add(“Mumbai”);
     interface

    ->/ In the same way, we will use Myclass for storing Double object and retrieve it.
     Double d = 20.25; // Same as Double d = new Double(20.25);
     Myclass<Double> obj2 = new Myclass<Double>(d);
   -> ArrayList<Car> carList = new ArrayList<Car>();
   the above we are using ArrayList but <String> make it Generic too
   by doing this we are ensuring that we can add string type of data 
   meanwhile in collection we can different object
   ------collection example--------
   import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // Using an ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Iterating over the ArrayList
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Using a HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");

        // Iterating over the HashSet
        for (String number : hashSet) {
            System.out.println(number);
        }

        // Using a HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Iterating over the HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

Gneric exampple:
import java.util.*;

public class GenericCollectionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        for (String s : list) {
            System.out.println(s);
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}


------random ----
Before generics, collections could store any type of objects, and developers often used collections to store different types of data. However, this flexibility came with some significant downsides:
i:-
List list = new ArrayList();
list.add("String");
list.add(123); // No compile-time error
ii:-we can  use collecion where we wnat to store the differnt type of data ,like the information of user in  the back record. where each person is treated as on object 
and we can use generic where we want to store one type data in the collections we can decalre its name 
->>>>>>>>
Collections: Provide a way to store and manage groups of objects.
Generics: Enhance collections by providing type safety, eliminating the need for casts, and improving code readability and maintainability.
Combined Use: Generics specify the type of elements a collection can hold, preventing runtime errors and making the code clearer and safer.
2.
// Create an object of Integer class.
     Integer i = 20; // This is same as: Integer i = new Integer(20);
  // Create an object of Myclass and store Integer object into it.  
     Myclass<Integer> obj = new Myclass<Integer>(i);
     3.
     Student[ ] st = new Student[5000];
     4:




     5:
Java collection->interfaces+classes
Key Interfaces in Collections Framework
Java programming language built the collections framework around four core interfaces:
Collection->Collection Interface of collection framework
List
Set
Map
Some of the most commonly used implementations of the Collections Framework in Java are as:
classes:
ArrayList
LinkedList
HashSet
HashMap
TreeMap
TreeSet
    random:
     array hs limiations like size amd what type of data we can store
     collection :
     By using collection object, we can store the same or different data without any size limitation.
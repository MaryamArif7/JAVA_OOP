package Static;


public class Test{
    int age;
    int salary;
    String name;
    static  int population;
Test(int age,int salary,String name){
this.age=age;
this.salary=salary;
this.name=name;
//acessing static with the classname
Test.population+=2;
}
public class Main{
public static void main(String[] args){
Test maryam=new Test(24,2300,"mary");

System.out.println(Test.population);
System.out.println(Test.population);

}
}
}
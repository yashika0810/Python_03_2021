package first;

public class AbstractSession {

    //Abstract class
    //abstract keyword -->
    //abstract class can have non abstract(concrete methods) and abstract methods
    //needs to be extended and it's method implemented
    //Abstract method- does not have a body
    //cannot be instantiated (Cannot create objects)

    //abstraction: --> hiding the implementation and showing functionality
    //Abstract class
    //Interface --> (100)abstraction, multiple inheritance




    //method overloading

    public static int minfunc(int n1, int n2){
        int min;
        if(n1>n2){
            min=n2;}
            else{
                min=n1;

            }
        return min;
        }

    public static double minfunc(double n1, double n2, double n3){
        double min;
        if(n1>n2){
            min=n2;}
        else{
            min=n1;

        }
        return min;
    }


    public static void main(String[] args) {

        Employee1 e1=new Programmer1();
        e1.work();
        e1.training();
        e1.setSalarybonus();
        minfunc(1.2,4,6);
    }
}


abstract class Employee1{

    public String name;
    public float salarybonus=5;

    public void setSalarybonus(){
        System.out.println("bonus every year" +salarybonus);
    }

    abstract public void work();
    abstract public void training();

}


class Programmer1 extends Employee1{

    public String name;
    public float salarybonus=8;

    public void work(){
            System.out.println("Working on app development");
    }
    public void training(){
        System.out.println("Training on Java");
    }

    public void setSalarybonus() {
//        salarybonus=10;
        System.out.println("bonus every year" + salarybonus);

    }
}

class Manager1 extends Employee1{

    public void work(){
        System.out.println("Working on epics");
    }
    public void training(){
        System.out.println("Training on Jira");
    }

}


//Interface -- 100 % abstraction --> contain abstract methods
//It has static and abstract methods ->fields-> public, final, static methods->public, abstract




//java 8-- can have both static and default methods
//java 9 - can have private methods


//
//class demo{
//    final void run(){
//
//    }
//    final int age=11;
//    age=40;
//}

interface run{
    //final - variable, method -- cannot override that method, class -> cannot inherit

    int min=5;  //public static final
    public void print();  //public, abstract
}




























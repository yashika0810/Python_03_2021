package first;


///Polymorphism ->
//compile time , runtime poly-method overriding

//Upcasting --> ref variable of parent class -refers_to-> object of child class


import second.Default;

import java.nio.file.FileSystemLoopException;

public class Inheritance {
    public static void main(String[] args) {
//        Employee e =new Employee();
//        e.work();
//        Programmer p=new Programmer();
//        p.writeprogram();
//        p.work(); // work,name, salary, writeprogram
//
//        System.out.println(p.name);
        Employee e1= new Programmer(new String[]{"java","python"},"name",10000);  //methods are resolved at runtime
        e1.work();
        Demo2 d=new Demo2();
        d.dm1();

         //attributes are resolved at compile time


    }
}

class Demo2 extends Default{
    void dm1(){
        super.method();
    }
}

class Employee{
    private String name = "Employee";
    private float salary=100;

    Employee(){
        System.out.println("name ="+name +"salary="+salary);
    }


    Employee(String name,float salary){
        this.name=name;
        this.salary=salary;
    }

    public void work(){
        System.out.println("Creating timehseets");
    }
}

class Programmer extends Employee{
    public String name="Programmer";
    public String[] programminglanguage = new String[]{"Java","Python","Javascript"};

    Programmer(){
        for(String s:programminglanguage)
        System.out.println(s);
    }

    Programmer(String[] programminglanguage,String name,float salary){

        super(name,salary); //call the constructor of superclass by super keyword , intialize the value of private members using constructor
        this.programminglanguage=programminglanguage;

    }
    public void work(){ //specfic implementation
        System.out.println("Working on Java Application/scala" );

    }

    public void writeprogram(){
        System.out.println("working on application development");
    }
}

class Manager{

}



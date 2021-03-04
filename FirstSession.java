package first;
//java.lang
import javax.swing.*;
import java.util.ArrayList;

public class FirstSession {
    private static int a=5; //static variable
    public static void main(String[] args) {

        byte b = 5; //1 byte
        short c = 2; //2 byte
        int i1 = 3332; //4 byte
        c=(short)i1; // explicit typecasting
        System.out.println(c);
        long l = 4; //8 byte
        l=i1; //implicit

        double d = 1.23; // 8 byte
        float f = 2.2f;  //4 byte



        boolean b1 = true;

        char c1 = 'a';
        String s1 = "hello consultadd";

        System.out.println('a' + 'b'); //add ascii values
        System.out.println("Hello" + "Consultadd"); //concatenate
    }}







//
//        Person obj = new Person(); //obj- reference variable
////        obj.age=5;
////        obj.name="Priyanka";
//        System.out.println(obj.age + "\n" + obj.name);
//        obj.sleep(5);
//        obj.work();
//
//    }

//}
//class Person{
//
//
//    //attributes  // obj type:person[[ name:[] : 4 bytes] [age:[]:4 bytes] sleep(),work()
//    String name = "yashika"; //instance variables
//    int age=7; //4 bytes
//
//
//
//    //behaviours
//    void sleep(int x){ //method parameter
//        String person_name="Akash"; //local variable
//        System.out.println("For 8 hours");
//    }
//
//    void work(){
//        System.out.println("For 9 hours" + name);
//    }
//
//}



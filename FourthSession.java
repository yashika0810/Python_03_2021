//package first;
//
//import java.time.Year;
//import java.util.*;
//
//public class FourthSession {
//    public static void main(String[] args) {
//
//        String st="HelloConsultadd";
//        String st1= new String("hello");  // new creates a new object space in heap
//        System.out.println(st + st1);
//        String st2="Hello";
//
//        if(st == st2){ //== checks the address which ref variable is pointing to st(add) != st1(add)
//            System.out.println(st + "is similar to" + st2);
//        }
//        System.out.println("not same");
//
//        if(st.equals(st1)){
//            System.out.println("equal");
//        }
//
//        ArrayList<Integer> al= new ArrayList<Integer>();
//        al.addAll(Arrays.asList(1,2,3,4,5));
//        Collections.sort(al);
//
//
//        //methods
//        //convert the odd index value of string to uppercase
//        System.out.println("Lower case" + st.toLowerCase()); //toUppercase()
//        System.out.println(st.indexOf('H'));
//        System.out.println(st.charAt(1));
//        System.out.println(st.concat(st1));
//        System.out.println(st.length());
//        System.out.println(st.replace('O', 'T'));
//
//        char ch1 [] = st.toCharArray();
//        for (char c:ch1){
//            System.out.println(c);
//        }
//
//
//        char ch [] = {'h', 'e', 'o','l','o'};
//        String chr=new String(ch);
//        System.out.println(chr);
//
//
//        //to replace vowel with @
//
//        char [] a= st.toCharArray();
//        for(int i=0; i<a.length; i++){  // 0 10
//            if
//            (a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u'){ //a[0] = h a[1]
//                a[i]='@'; //a[0]=@
//            }}
//            System.out.println(String.valueOf(a)); //converts to string
//
//
////split
//        String[] newstr=st.split(" ");
//        String [] strarr= { "Java", "Python", "AWS"};
//        String s= String.join("-", strarr);
//        System.out.println(s);
//        System.out.println(s.replace('a', '#').substring(0,4)); //slicing
//
//        //StringBuilder - used to create mutable string
//
//        //String- space consuming
//
//        StringBuilder sb=new StringBuilder("Welcome to Training");
//        sb.append('!');
////        sb.reverse();
//        sb.insert(0,"Hello");
//        sb.replace(0,4, "consultadd");
//        System.out.println(sb);
//
//        //reverse
//
//        String word="MY name is Yashika";
//        StringBuilder result=new StringBuilder(""); // akihasy
//        char [] reverse=word.toCharArray(); //My name is
//        for(int i=reverse.length-1;i>=0; i-- ){ // 13 10 9 8 7 6..... 0
//            result.append(reverse[i]); //--> result.append(reverse[13] )--> a , 12, 11,10..0
//        }
//        System.out.println(result);
//        //replace, indexof, charAt, substring, etc
//       //reverse through swapping
//
//
//
//
//
//
//
//
//
//
//        FourthSession obj1=new FourthSession(4,6);
//        FourthSession obj2=new FourthSession(4,6,8);
//        obj2.display();
//        obj1.display();
//    }
//
//        //constructor
//        //default constructor
//
//        //Syntax class Classname{ classname(){ } }
//        int age;
//        int empid;
//        double salary;
//
//        //Default constructor
////        FourthSession(){
////            age=4;
////        }
//
//        //paramterized constructor
//
//        FourthSession(int i, int j){
//            age=i;
//            empid=j;
//        }
//
//        FourthSession(int i, int j ,double s){ // double s, int i
//            age=i;
//            empid=j;
//            salary=s;
//
//        }
//
//        public void display(){
//            System.out.println(age + "\n" + empid + "\n" + salary);
//
//    }
//
//}

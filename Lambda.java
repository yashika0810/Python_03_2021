package first;


import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Functional interface
interface functionalinterface{
    public int method1(int x);

}


//class LambdaDemo implements functionalinterface{
//    public int method1(int x){
//        return x*x;
//
//    }
//}




class Employee2 {
    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    private int id;
    private String name;
    private double salary;



    Employee2(int id, String name, double salary) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameId(int id) {
        return name;

    }

    public double getSalaryID(int id) {
        return salary;
    }

    public double Salaryincement(double increment) {
        salary = salary + increment;
        return salary;
    }}

    public class Lambda {


        public static void main(String[] args) {

            Employee2[] emp = {new Employee2(1, "Priyanka", 43134),
                    new Employee2(2, "Mehul", 456221),
                    new Employee2(2, "Mehul", 3253),
                    new Employee2(5, "Vaibhav", 4563),
                    new Employee2(3, "Sagar", 8853)
            };


            //stream --> list, set

            Stream<Employee2> streamemp = Stream.of(emp);
            System.out.println(streamemp);
            //collect

            List <Employee2> emplist= streamemp.collect(Collectors.toList());
            emplist.forEach(System.out::println);
            System.out.println();


            //generate

            Stream <String> st = Stream.generate(() -> "hello").limit(5);
            st.forEach(System.out::println);

//            //iterate
//            Stream<Integer> streamint= Stream.iterate(0,i -> i+2);
//            streamint.limit(30).forEach(System.out::println);


            //intermediate operations - map, filter,reduce
            //terminal operations - forEach, count

            //map, filter

            ArrayList <Integer> arr = new ArrayList<Integer>();
            arr.addAll(Arrays.asList(12,3,5,6,1,5,2,1));

            List <Integer> add1= arr.stream().filter(x -> x%2==0).map(x -> x*x).collect(Collectors.toList());
            add1.forEach(System.out::println);

            //filter salaries

            List <Double> salaries=  emplist.stream().map(e -> e.getSalaryID(e.getId())).filter(salary -> salary >5233).collect(Collectors.toList());

            System.out.println(salaries);

            //flatmap

            List <List<String>> fullname= Arrays.asList(Arrays.asList("Yashika", "Khatri"),
        Arrays.asList("xyz","abc"),
        Arrays.asList("ywz","afc"));

            List <String> ls=fullname.stream().flatMap(Collection::stream).collect(Collectors.toList());
            System.out.println(ls);


            //Pipeline-
            // source,
            //intermediate operations - map, filter,reduce
            //terminal operations - forEach, count


            //source-empList , intermediate- map, filter, terminal operation- count
            long sal= emplist.stream().map(e-> e.getSalaryID(e.getId())).filter(salary -> salary>39201).count();
            System.out.println("Count is" + sal);


            //Comparision

            List<Employee2> ls1 = emplist.stream().sorted((e1,e2) -> e1.getNameId(e1.getId()).compareTo(e2.getNameId(e1.getId()))).collect(Collectors.toList());


            //min max

//            int min= arr.stream().min((e1,e2)->e1-e2).orElseThrow();
            Optional <Integer> minimum=arr.stream().min((e1,e2)->e1-e2);
            if(minimum.isPresent()){
                System.out.println(minimum);
            }
            Optional <Integer> max=arr.stream().max((e1,e2)->e1-e2);
            if(max.isPresent()){
                System.out.println(max);
            }


            // allmatch, nomatch, anymatch


            boolean allmatch= arr.stream().allMatch(i -> i%2==0); //False
            boolean anymatch= arr.stream().anyMatch(i -> i%2==0); //True
            boolean nomatch= arr.stream().noneMatch(i -> i%2==0); //False

            System.out.println(allmatch + " " + anymatch + " " + nomatch);


            //Unique

            List<Integer> arr2=Arrays.asList(1,24,5,4,4,1,2,4,6);
            List <Integer> distinct= arr2.stream().distinct().collect(Collectors.toList());
            System.out.println(distinct);

            //sum, avg, reduce

            Double avgsalary= emplist.stream().mapToDouble(e-> e.getSalaryID(e.getId())).sum();
            System.out.println(avgsalary);


            //sum--> sum, reduce
            //reduce-> {12,4,4,6,7} --> ((((12+4)+4)+6+7 )--> reduce--> integer
            Integer sum2=arr.stream().filter(c->c%2==0).reduce(0,(x1,x2)->x1+x2);
            System.out.println(sum2);

            //join
            String joinstr= emplist.stream().map(e->e.getNameId(e.getId())).collect(Collectors.joining(" ")).toString();
            System.out.println(joinstr);

































        //Syntax: (argument (empty/non-empty)) -> {body--> expression&statements}


//        functionalinterface f1 = (int x) -> {
//            System.out.println("Square of numbers is");
//            return x + 5;
//        };
//       System.out.println(f1.method1(4));
    }}







    //Lambda expression-> provide implementation of a functional interface







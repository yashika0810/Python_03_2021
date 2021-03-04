package first;

import java.util.Scanner;

public class ThirdSession {

    //initialized once -> one copy to all the instances
    public static int locker;
    public static void main(String[] args) {
        // class variable --static

        ThirdSession obj= new ThirdSession();  //empid, name, salary
        ThirdSession obj2 = new ThirdSession(); //empid, name , salary
        obj.empid=5;
//        obj2.empid=3;
        obj.locker=3;
        System.out.println(obj.empid + "\n" + obj2.empid);
        System.out.println(obj.locker + "\n" + obj2.locker);


        obj.printDetails();
        obj.setEmpid(6,5,6);
        System.out.println(obj.getEmpid());
       System.out.println(obj.salarywithBonus(444,900));

        //Syntax:
//        int i=10;
//        while(i>1){ //10
//            System.out.println(i);
//            i++; //9
//        }
        int i1 = 1;
        while (i1 <= 10) {
            System.out.println(i1 * 2);
            i1++;
        }

        int arr[] = {2, 1, 22, 4, 5};
        int i2 = 0;
        while (i2 < 4) {
            System.out.println(arr[i2]); //0,1,2,3
            i2++;

        }
        //do-while  --> do { statements} while(condition);

        int i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i > 1);


        //sum from
        int i4 = 200;
        int sum = 0;
        do
        {
            sum += i4;
            i4++;

        }while(i4<200);

        System.out.println(sum);


        //

//        int avg=0;
//        int total=0;
//        int count=0;
//
//        System.out.println("ENter your grade (-1 will quit the loop)");
//        Scanner sc=new Scanner(System.in);
//        int grade= sc.nextInt();
//        while(grade!=-1 && count<=4){
//            total=total+grade; //55 --> 44 55+44
//            count=count+1; // 5
//            System.out.println("Enter your grade");
//            grade=sc.nextInt();
////            if(count==4){
////                break;
//        }

//        avg=total/count;
//        System.out.println("Average is" + avg);
//


        //continue

        for(int j=0; j<=6; j++){ //0 1 2 3 4 5 6
            if (j==4){
                continue;
            }
            System.out.println(j + " ");
        }


        //break
        int num=0;
        while(num<=100){
            System.out.println("value of var" + num);
            if(num==2){
                break;  //throws out of loop
            }
            num++;
        }
        System.out.println("out of while loop");

    }
    //Methods Syntax: modifier return_type <name0fmethod> (Parameters){ //method body }

    //without return type without parameter

    int empid; //instance variables
    double salary;
    String name; //instance variables --> 0

    public void printDetails() {
        System.out.println(empid + "\n" + salary + "\n" + name);
    }

    //with return type without parameters

    public int getEmpid(){
        int emp_dept; //local variable
        this.empid=3;
        return empid;
    }

    //with return type with parameter

    public double salarywithBonus(double salary,double bonus){
        this.salary=salary;
        return salary+bonus;
    }

    //without return type with paramaters

    public void setEmpid(int empid, int i, int j){ //method parameter
        this.empid=empid ;
        int result=i*j;
        System.out.println("empid " + empid + "\n" + result);


    }



}

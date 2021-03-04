package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FivthSession {


    //Arraylist--> dynamic array for storing // there is no size limit
    //can contain duplicate elemets
    //random access, [12,3,5,7]



    //[2,3,4,5,6] --> 7 (3,4) (2,5)
    static void getpair(int inputArr[],int inputnum){
        System.out.println("Pairs of elements whose sum is" + inputnum + "are:");
        for(int i =0;i<inputArr.length;i++){
            for(int j=i+1;j<inputArr.length;j++){
                if(inputArr[i]+inputArr[j]==inputnum){
                    System.out.println(inputArr[i] + "," + inputArr[j]);
                }
            }
        }
    }


    // reverse each word
    //My name is Yashika --> akihsay si eman .. --> yM eman si akihsaY

    public static String reverse(String str){
        String word [] = str.split(" "); //"MY" "name" "is"
        String reverseword="";
        for(String w:word){
            StringBuilder sb=new StringBuilder(w); //name
            sb.reverse(); //yM //eman
            reverseword+=sb.toString() + " "; //yM eman

        }
        return reverseword;

    }


    public static void main(String[] args) {
        System.out.println(reverse("My name is Yashika"));
        getpair(new int[]{3,4,6,7,2,1,3,5},9);


        //Arraylist
        ArrayList <String> al=new ArrayList<String>(); //10

        al.addAll(Arrays.asList("Welcome","to","Training"));
        for(int i =0;i<al.size();i++){
            System.out.println(al.get(i) + " ");
        }
        for(String i:al){
            System.out.println(i);
        }
        System.out.println(al);


//        int n=10;
        ArrayList <Integer> arrl= new ArrayList<Integer>(Arrays.asList(8,6,4,2,1,3)); //add at once
//        for(int i=1;i<=n;i++) {
//            arrl.add(i);
//        }
        Collections.sort(arrl);
        Collections.reverse(arrl);
        System.out.println(arrl);



//        al.ensureCapacity(20);
//        al.add("Hello");
//        al.add("consultadd");
        ArrayList <String> trainings=new ArrayList<String>();
        trainings.add("Java");
        trainings.add("Python");
        trainings.add("AWS");
        System.out.println(trainings);



        System.out.println(trainings.addAll(2,al));





        //accessing
        trainings.get(0);
        trainings.set(0,"hello"); //modification
        trainings.remove("hello"); //objects and index
        trainings.clear(); //clear all the elements
        trainings.size();





















        //Arrays --> similar data type of elements , finite storage, index based

        //a -> [1,2,3,4,5,6] -> linear storage
//
//        int [] i1;
//        int i2 []; //declaration
//        String [] st;
//
//        //2 types
//        String st2 [][];
//
//        //Assign values
//        i1= new int[10]; // size capacity
//
//        int a []= new int[5]; //declration and instantiition
//        a[0]=10;
//        a[1]=5;
//        a[2]=5;
//        a[3]=6;
//        a[4]=7;
//
////        for(int i=0;i<a.length;i++){
////            System.out.println(a[i]);
////        }
//
//        int arr[] = {33,4,5,6,8,2};
//
//        for(int i :arr){
//            System.out.println(i);
//        }
//
////        for(int i=0;i<arr.length;i++){
////            System.out.println(arr[i]);
////        }



//        String [] strarr = {"Java","Python","AWS","BA","Java","BA"};
//        for(int i=0;i<strarr.length-1;i++){ //0 1 2 3 4
//            for(int j=i+1;j<strarr.length;j++){ //i=0  j= 1 2 3 4 5 i=1 , j=2,3,4,5
//                if ((strarr[i].equals(strarr[j]) && (i!=j))){
//                    System.out.println("Duplicate are" + strarr[j]);
//                }
//            }
//        }

    }
}

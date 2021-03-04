package first;

import java.io.*;
import java.util.*;


public class Collections {



    //Sort the characters according to their frequency.
    //aabcccccddd -> a:2 c:1 -> badc
    //(a,1) --> value + 1 --> (a,2)

    static void charcount(String inputstring){

        HashMap<Character,Integer> charcountmap= new HashMap<Character,Integer>();
        //converting into array

        char [] strarr = inputstring.toCharArray();
        //check

        for(char c:strarr){   //a
            if(charcountmap.containsKey(c)){   //
                charcountmap.put(c,charcountmap.get(c)+1); // (a,2)
            }else{
                charcountmap.put(c,1);  // (a,1)
            }
        }
        for(Map.Entry entry:charcountmap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }



    public static void main(String[] args) {


        charcount("aabbcddee");

        ArrayList <Integer> al= new ArrayList<Integer>();  //{1,2,3,5,4} --> shifting occurs
        al.add(12);
        al.addAll(Arrays.asList(1,2,3,4,6));
        al.clone();

        LinkedList<Integer> ls = new LinkedList<Integer>(); //{1,2,3,5,6} --> 1-->2-->3-->5-->6
        ls.add(12);
        ls.push(12); //add at the end
        ls.pop();


        //Map--> <Key, Value>
        //access the value through it's key

        //Key --> name, age, salary --> unique
        //Value--> yashika, 25, 379201 --> can be duplicate

        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(4,"AWS");
        map.put(3,"Java");
//        System.out.println(map);
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" " + m.getValue());
        }

//        LinkedHashMap<Integer,Integer> lm=new LinkedHashMap<Integer,Integer>();
//        lm.put(null,4);
//        lm.put(3,5);
//        for(Integer i:lm.keySet()){
//            System.out.println("Key" + i + "value" + lm.get(i));
//        }

        //Sort in terms of keys--> use Treemap (not maintain insertion order - maintains ascending order)

        TreeMap<Integer,Integer> tm= new TreeMap<Integer,Integer>();
        tm.put(4,1);
        tm.put(1,4);
        tm.put(7,1);
        tm.put(6,1);
        for(Integer i:tm.keySet()){
            System.out.println("Key" + i + "value" + tm.get(i));
        }

        //Set-->Unique unordered values--> does not have duplicates


        HashSet<Integer> hs =new HashSet<Integer>();
        hs.addAll(Arrays.asList(1,2,3,5,61,3,12,4,1,5));
        hs.forEach(System.out::println); //lambda





        //File Handling-->

        //xml/json -->
        //Operations -> creating, reading, updating, deleting


        //creating

        File file=new File("Test.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File exists");
                System.out.println(file.getName());
            }}catch (IOException e){

            e.printStackTrace();
        }

        //write
        try{
            FileWriter fw=new FileWriter("Tes.txt");
            String s="hey Welcome to the Training";
            fw.write(s);
            fw.append("adding a new line");
            fw.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        //read

        try{
            FileReader fr = new FileReader("Te.txt");
            fr.read();


        }catch (FileNotFoundException e){
            System.out.println("Error opening that file, Please enter the correct name");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }

        //delete
        File file1= new File(("Test.txt"));
        if(file.exists()){
            file1.delete();
            System.out.println("File Deleted");
        }






























}}

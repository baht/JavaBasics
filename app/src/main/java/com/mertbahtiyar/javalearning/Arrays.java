package com.mertbahtiyar.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args){

        //Array

        String[] myStringArray = new String[3];
        myStringArray[0] = "Mert";
        myStringArray[1] = "Bahtiyar";
        myStringArray[2] = "Samsun";
        System.out.println(myStringArray[0]);

        int[] myIntegerArray = new int[3];
        myIntegerArray[0] = 26;
        myIntegerArray[1] = 1;
        myIntegerArray[2] = 1992;
        System.out.println(myIntegerArray[0]);

        int[] myNumberArray = {1,2,3,4,5,6,7,8};
        System.out.println(myNumberArray[2]);

        //Lists

        ArrayList<String> myMusicians = new ArrayList<String>();
        myMusicians.add("Mert");
        myMusicians.add("Bahtiyar");
        myMusicians.add(1,"Samsun");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));

        //Set

        HashSet<String> mySet = new HashSet<>();
        mySet.add ("Mert");
        mySet.add ("Mert");

        System.out.println(mySet.size());

        //HashMap

        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("name", "Mert");
        myHashMap.put("instrument", "Guitar");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

        HashMap<String, Integer> mySecondMap = new HashMap<>();

        mySecondMap.put("run", 100);
        mySecondMap.put("basketball", 200);
        System.out.println(mySecondMap.get("run"));


    }
}

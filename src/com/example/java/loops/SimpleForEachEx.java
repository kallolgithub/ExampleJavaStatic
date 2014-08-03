package com.example.java.loops;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kallol on 8/3/14.
 */
public class SimpleForEachEx {
    public static void main(String args[]){
        List<String> al = new ArrayList<String>();
        al.add("java2novice");
        al.add("for each");
        al.add("java 1.5");
        al.add("www.java2novice.com");
        System.out.println(al);

        for(String str : al){
            System.out.println(str);
        }
    }
}

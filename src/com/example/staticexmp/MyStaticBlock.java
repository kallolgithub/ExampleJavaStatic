package com.example.staticexmp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kallol on 8/2/14.
 */
public class MyStaticBlock {

   public static List<String> list;

//    static {
//        list = new ArrayList<String>();
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("four");
//    }
  //checking static block vs constructor
    static {
      System.out.println("I am in static block");
      System.out.println("Static block will be called first than constructor!!!");
      System.out.println("Static block will be called only once");
  }
    public MyStaticBlock(){
        System.out.println("I am in constructor");
    }
//    public void testList(){
//        System.out.println(list);
//    }

    public static void main(String args[]){
        MyStaticBlock msb = new MyStaticBlock();
        MyStaticBlock msb1 = new MyStaticBlock();
        MyStaticBlock msb2 = new MyStaticBlock();
        MyStaticBlock msb3 = new MyStaticBlock();
        MyStaticBlock msb4 = new MyStaticBlock();

//        msb.testList();

    }
}

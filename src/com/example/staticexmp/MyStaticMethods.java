package com.example.staticexmp;

/**
 * Created by kallol on 7/31/14.
 */
public class MyStaticMethods {

    private String name;
    private static String staticStr = "STATIC-STRING";

    public MyStaticMethods(String n) {
        this.name = n;
    }

    public static void testStaticMethod() {

        System.out.println("Hey I am in StaticMethod");
        System.out.println(MyStaticMethods.staticStr);
    }

    public void testObjectMethod() {

        System.out.println("Hey I am in non-static method");
        System.out.println(MyStaticMethods.staticStr);
        System.out.println("Name : " + this.name);
    }

    public static void main(String args[]) {

        MyStaticMethods.testStaticMethod();
        MyStaticMethods msm = new MyStaticMethods("kallol");
        msm.testObjectMethod();
    }
}

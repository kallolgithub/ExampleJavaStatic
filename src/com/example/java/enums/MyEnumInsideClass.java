package com.example.java.enums;

/**
 * Created by kallol on 8/3/14.
 */
public class MyEnumInsideClass {
    private MyWrapper.Fruits myFruit;

    public MyEnumInsideClass(MyWrapper.Fruits myFruit) {
        this.myFruit = myFruit;
    }

    public void getFruitsDesc() {
        switch (myFruit) {
            case GRAPE:
                System.out.println("A grape is a non-climacteric fruit.");
                break;
            case APPLE:
                System.out.println("The apple is the pomaceous fruit.");
                break;
            case MANGO:
                System.out.println("The mango is a fleshy stone fruit.");
                break;
            case LEMON:
                System.out.println("Lemons are slow growing varieties of citrus.");
                break;
            default:
                System.out.println("No desc available.");
                break;
        }

    }

    public static void main(String args[]) {
        MyEnumInsideClass grape = new MyEnumInsideClass(MyWrapper.Fruits.GRAPE);
        grape.getFruitsDesc();
        MyEnumInsideClass apple = new MyEnumInsideClass(MyWrapper.Fruits.APPLE);
        apple.getFruitsDesc();
        MyEnumInsideClass lemon = new MyEnumInsideClass(MyWrapper.Fruits.LEMON);
        lemon.getFruitsDesc();
        MyEnumInsideClass guava = new MyEnumInsideClass(MyWrapper.Fruits.GUAVA);
        guava.getFruitsDesc();

    }
}

class MyWrapper {
    enum Fruits {
        GRAPE, APPLE, MANGO, LEMON, GUAVA
    }
}

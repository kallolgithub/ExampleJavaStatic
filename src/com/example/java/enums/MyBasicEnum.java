package com.example.java.enums;

/**
 * Created by kallol on 8/3/14.
 */
public class MyBasicEnum {
    private Fruits myFruit;

    public MyBasicEnum(Fruits myFruit) {
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
        MyBasicEnum grape = new MyBasicEnum(Fruits.GRAPE);
        grape.getFruitsDesc();
        MyBasicEnum apple = new MyBasicEnum(Fruits.APPLE);
        apple.getFruitsDesc();
        MyBasicEnum lemon = new MyBasicEnum(Fruits.LEMON);
        lemon.getFruitsDesc();
        MyBasicEnum guava = new MyBasicEnum(Fruits.GUAVA);
        guava.getFruitsDesc();

    }
}

enum Fruits {
    GRAPE, APPLE, MANGO, LEMON, GUAVA
}

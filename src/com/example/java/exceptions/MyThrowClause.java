package com.example.java.exceptions;

/**
 * Created by kallol on 8/5/14.
 */
public class MyThrowClause {
    public static void main(String args[]) {
        MyThrowClause mtc = new MyThrowClause();
        try{
            for(int i=0; i<5; i++){
                mtc.getJunk();
                System.out.println(i);
            }
        }catch (InterruptedException iex){
            System.out.println(iex);
        }
    }
    public void getJunk() throws InterruptedException {
        Thread.sleep(1000);
    }
}



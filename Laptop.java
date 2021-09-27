package com.sadiqtechsoft.Java;

public abstract class Laptop {

    public void keyBoard()
    {
        System.out.println("All Laptop has Keyboard");

    }public void mousePad(){
        System.out.println("All Laptop has Mouse Pad");
    }
    public abstract void fingerPrint();
    public abstract void touchScreen();
    public abstract void faceRecognition();

}

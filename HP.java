package com.sadiqtechsoft.Java;

public class HP extends Laptop{

    @Override
    public void fingerPrint() {
        System.out.println("HP has Finger Print");
    }
    @Override
    public void touchScreen(){
        System.out.println("HP has Touch Screen");
    }

    @Override
    public void faceRecognition() {
        System.out.println("HP is working on Face Recognition");
    }
}

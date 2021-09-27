package com.sadiqtechsoft.Java;

public class Asus extends Laptop{

    @Override
    public void fingerPrint(){
        System.out.println("Asus has Finger Print");
    }
    @Override
    public void faceRecognition(){
        System.out.println("Asus doesn't have Face Recognition");
    }
    @Override
    public void touchScreen(){
        System.out.println("Asus has Touch Screen");
    }
}

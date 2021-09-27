package com.sadiqtechsoft.Java;

public class Dell extends Laptop{

    @Override
    public void fingerPrint(){
        System.out.println("Dell doesn't have Finger Print");
    }
    @Override
    public void touchScreen(){
        System.out.println("Dell has Touch Screen");
    }
    @Override
    public void faceRecognition(){
        System.out.println("Dell don't care Face Recognition");
    }

}

package com.sadiqtechsoft.Java;

public class LaptopInfo {
    public static void main(String[] args) {

        HP hp = new HP();
        Dell dell = new Dell();
        hp.keyBoard();
        Asus asus = new Asus();

        hp.fingerPrint();
        dell.fingerPrint();
        asus.fingerPrint();
        hp.touchScreen();
        dell.touchScreen();
        asus.touchScreen();
        hp.faceRecognition();
        dell.faceRecognition();
        asus.faceRecognition();


    }
}

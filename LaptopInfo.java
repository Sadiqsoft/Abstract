package com.sadiqtechsoft.Java;

public class LaptopInfo {
    public static void main(String[] args) {

        HP hp = new HP();
        Dell dell = new Dell();
        hp.keyBoard();

        hp.fingerPrint();
        dell.fingerPrint();
        hp.touchScreen();
        dell.touchScreen();
        hp.faceRecognition();
        dell.faceRecognition();




    }
}

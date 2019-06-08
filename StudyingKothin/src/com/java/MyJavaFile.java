package com.java;

import com.mykotlin.MyCustomKotlinFileName;

public class MyJavaFile {

    public static void main(String[] args) {
        int sum = MyCustomKotlinFileName.addSum(3,4);
        System.out.println("Printing sum from Java file: "+ sum);

        int result = MyCustomKotlinFileName.findVolume(4,5);
        System.out.println(result);
    }

    public static int getArea(int l, int b) {
        return l*b;
    }
}

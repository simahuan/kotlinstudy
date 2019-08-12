package com.pisen.string;

public class TypeCast {

    public static void main(String[] args) {
//        Child c = new Child();
//        Parent p = new Child();
//        c.getName();
//        System.out.println(((Child)p).getName());
//        if (p instanceof  Child){
//            System.out.println("Y");
//        }
        Parent p = new Child();
        if (p instanceof  Child){
            System.out.println(((Child) p).getName());
        }

        System.out.println("Hello World");
    }




}

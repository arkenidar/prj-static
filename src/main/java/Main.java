package com.arkenidar;

public class Main {

    public static void main(String[] args) {
        System.out.println("about static modifier");
    }

    private static ClassTest field1=new ClassTest();
}

class ClassTest {
    ClassTest(){
        System.out.println("constructor...");
    }
}
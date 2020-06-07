package com.sboo.override;

public class Parent {
    public void print() {
        System.out.println("Parent");
    }

    public void indirectPrint() {
        print();
    }
}

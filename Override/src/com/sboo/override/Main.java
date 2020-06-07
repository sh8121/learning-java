package com.sboo.override;

public class Main {

    public static void main(String[] args) {
	    Parent parent = new Child();
	    parent.print();
	    parent.indirectPrint();
    }
}

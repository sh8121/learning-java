package org.example;

public class Printer extends Thread {
    private String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100; i++)
            System.out.printf("%s 출력\n", name);
    }
}

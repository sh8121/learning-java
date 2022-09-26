package org.example.generic;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ElectronicsList<Electronics> electronicsList = new ElectronicsList<>();
        electronicsList.add(new Tv("제조사1", "티비1"));
        electronicsList.add(new Tv("제조사2", "티비2"));
        electronicsList.add(new Radio("제조사3", "라디오1"));
        electronicsList.add(new Radio("제조사4", "라디오2"));

        printManufacturer(electronicsList);
    }

    private static void printManufacturer(List<Electronics> electronicsList) {
        for (Electronics electronics : electronicsList) {
            System.out.println("electronics.manufacturer = " + electronics.getManufacturer());
        }
    }
}

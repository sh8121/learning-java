package org.example.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tv> tvList = new ArrayList<>();
        List<Radio> radioList = new ArrayList<>();
        tvList.add(new Tv("제조사1", "티비1"));
        tvList.add(new Tv("제조사2", "티비2"));
        radioList.add(new Radio("제조사3", "라디오1"));
        radioList.add(new Radio("제조사4", "라디오2"));

        printManufacturer(tvList);
        printManufacturer(radioList);
    }

    private static void printManufacturer(List<? extends Electronics> electronicsList) {
        for (Electronics electronics : electronicsList) {
            System.out.println("electronics.manufacturer = " + electronics.getManufacturer());
        }
    }
}

package org.example.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tv> tvList = new ArrayList<>();
        tvList.add(new Tv("제조사A", "티비A"));
        tvList.add(new Tv("제조사A", "티비B"));
        tvList.add(new Tv("제조사B", "티비C"));
//        tvList.add(new Radio("제조사A", "라디오A")); // Compile Error

        List<Radio> radioList = new ArrayList<>();
        radioList.add(new Radio("제조사A", "라디오A"));
        radioList.add(new Radio("제조사B", "라디오B"));
        radioList.add(new Radio("제조사B", "라디오C"));
//        radioList.add(new Tv("제조사A", "티비A")); // Compile Error

        for (Tv tv : tvList) {
            System.out.println("tv.title = " + tv.getTitle());
        }

        for (Radio radio : radioList) {
            System.out.println("radio.name = " + radio.getName());
        }
    }
}

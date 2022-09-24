package org.example.generic;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List tvList = new ArrayList();
        tvList.add(new Tv("제조사A", "티비A"));
        tvList.add(new Tv("제조사A", "티비B"));
        tvList.add(new Tv("제조사B", "티비C"));
        tvList.add(new Radio("제조사A", "라디오A"));

        for (Object o : tvList) {
            Tv tv = (Tv)o; //ClassCastException
            System.out.println("tv.title = " + tv.getTitle());
        }
    }
}

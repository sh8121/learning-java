package org.example.generic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tv> tvs = new ArrayList<>();
        tvs.add(new Tv("티비1"));
        tvs.add(new Tv("티비2"));
        tvs.add(new Tv("티비3"));

        List<? extends Electronics> electronics = tvs;
        for (Electronics e : electronics) {
            System.out.println(e);
        }

        //electronics.add(new Tv("티비4")); compile error
    }
}

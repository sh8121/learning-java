package org.example.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Tv> tvList = new ArrayList<>(){{add(new Tv("제조사2", "티비"));}};
        List<Radio> radioList = new ArrayList<>(){{add(new Radio("제조사3", "라디오"));}};

        ElectronicsStore store = new ElectronicsStore();
        store.save(tvList, List<Tv>.class);
        store.save(radioList, List<Radio>.class);

        List<Tv> findTvList = store.find(List<Tv>.class);
        List<Radio> findRadioList = store.find(List<Radio>.class);
    }

    private static void printManufacturer(List<? extends Electronics> electronicsList) {
        for (Electronics electronics : electronicsList) {
            System.out.println("electronics.manufacturer = " + electronics.getManufacturer());
        }
    }
}

class ElectronicsStore {
    private final Map<Class<?>, Object> store = new HashMap<>();

    public <T> void save(T obj, Class<T> clazz) {
        store.put(clazz, obj);
    }

    public <T> T find(Class<T> clazz) {
        return clazz.cast(store.get(clazz));
    }
}

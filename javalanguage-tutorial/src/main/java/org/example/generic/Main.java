package org.example.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Tv> tvList = new ArrayList<Tv>(){{add(new Tv("제조사1", "티비"));}};
        List<Radio> radioList = new ArrayList<Radio>(){{add(new Radio("제조사2", "라디오"));}};

        ElectronicsStore store = new ElectronicsStore();
        store.save(tvList, List.class);
        store.save(radioList, List.class);

        List<Tv> findTvList = store.find(List.class);
        List<Radio> findRadioList = store.find(List.class);

        System.out.println(findTvList.equals(findRadioList));
        for (Tv tv : findTvList) {
            System.out.println("tv = " + tv);
        }
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

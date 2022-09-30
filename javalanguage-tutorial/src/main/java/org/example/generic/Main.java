package org.example.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Electronics electronics = new Electronics("제조사1");
        Tv tv = new Tv("제조사2", "티비");
        Radio radio = new Radio("제조사3", "라디오");

        ElectronicsStore store = new ElectronicsStore();

//        Impossible
//        store.<Electronics>save(electronics);
//        store.<Tv>save(tv);
//        store.<Radio>save(radio);
//
//        Electronics findElectronics = store.<Electronics>find();
//        Tv findTv = store.<Tv>find();
//        Radio findRadio = store.<Radio>find();

//        Alternative
        store.<Electronics>save(electronics, Electronics.class);
        store.<Tv>save(tv, Tv.class);
        store.<Radio>save(radio, Radio.class);

        Electronics findElectronics = store.<Electronics>find(Electronics.class);
        Tv findTv = store.<Tv>find(Tv.class);
        Radio findRadio = store.<Radio>find(Radio.class);

//        store.save(electronics, Electronics.class);
//        store.save(tv, Tv.class);
//        store.save(radio, Radio.class);

        store.<Electronics>print();
    }

    private static void printManufacturer(List<? extends Electronics> electronicsList) {
        for (Electronics electronics : electronicsList) {
            System.out.println("electronics.manufacturer = " + electronics.getManufacturer());
        }
    }
}

class ElectronicsStore {
//    public <T extends Electronics> void save(T obj) {
//        //T.class 로 타입정보를 알아내어 (타입, 객체)를 저장
//        T.class; //Error
//    }
//
//    public <T extends Electronics> T find() {
//        //T.class 로 타입정보를 알아내어 타입에 매칭된 객체 반환
//        T.class; // Error
//    }

    private final Map<Class<? extends Electronics>, Object> store = new HashMap<>();

    public <T extends Electronics> void save(T obj, Class<T> clazz) {
        store.put(clazz, obj);
    }

    public <T extends Electronics> T find(Class<T> clazz) {
        return clazz.cast(store.get(clazz));
    }
}

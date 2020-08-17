package com.sboo;

public class Database {
    private static Database singleton = new Database("products");
    private String name;

    private Database(String name) {
        try {
            Thread.sleep(100);
            this.name = name;
        }
        catch (Exception e){}
    }

    //static load 시점에 미리 로드 해놓고 사용하면 굳이 synchronized를 적용할 필요가 없다.
    public static Database getInstance(String name){
        return singleton;
    }

    public String getName() {
        return name;
    }
}

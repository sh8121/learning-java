package com.sboo;

public class Sboo {
    public void work() {
        System.out.println(Sboo.class);
        Sboo sboo = new Sboo();
        System.out.println(sboo.getClass());
        Class<Sboo> clazz = Sboo.class;
        System.out.println(clazz);
        System.out.println(clazz == sboo.getClass());
    }
}

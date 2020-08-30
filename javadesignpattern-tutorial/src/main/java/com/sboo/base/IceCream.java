package com.sboo.base;

public abstract class IceCream {

    protected String description = "";

    public String getDescription() {
        return this.description;
    }

    public abstract int price();
}

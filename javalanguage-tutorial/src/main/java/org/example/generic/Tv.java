package org.example.generic;

public class Tv extends Electronics {
    private String title;

    public Tv(String manufacturer, String title) {
        super(manufacturer);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

package org.example.generic;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv("티비");
        Radio radio = new Radio("라디오");

        RemoteController<?> tvRemoteController = new RemoteController<Tv>(tv);
        RemoteController<?> radioRemoteController = new RemoteController<Radio>(radio);
    }
}

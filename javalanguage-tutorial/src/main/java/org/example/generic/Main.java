package org.example.generic;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv("티비");
        Radio radio = new Radio("라디오");

        RemoteController<Electronics> tvRemoteController = new RemoteController<Tv>(tv); // compile error
        RemoteController<Electronics> radioRemoteController = new RemoteController<Radio>(radio); // compile error
    }
}

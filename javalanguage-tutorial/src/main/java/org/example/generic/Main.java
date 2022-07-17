package org.example.generic;

public class Main {
    public static void main(String[] args) {
//        Tv tv = new Tv("티비");
//        Radio radio = new Radio("라디오");
//
//        RemoteController<? extends Electronics> tvRemoteController = new RemoteController<Tv>(tv);
//        RemoteController<? extends Electronics> radioRemoteController = new RemoteController<Radio>(radio);

        Electronics electronics = new Electronics();
        RemoteController<? super Tv> remoteController = new RemoteController<Electronics>(electronics);
    }
}

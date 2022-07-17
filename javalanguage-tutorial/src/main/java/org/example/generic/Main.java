package org.example.generic;

public class Main {
    public static void main(String[] args) {
        Tv tv1 = new Tv("티비1");
        Radio radio1 = new Radio("라디오1");
        RemoteController<Tv> tvRemoteController = new RemoteController<Tv>(tv1);
        RemoteController<Radio> radioRemoteController = new RemoteController<Radio>(radio1);

        System.out.println(tvRemoteController.getClass());
        System.out.println(radioRemoteController.getClass());
    }
}

package org.example.generic;

public class Main {
    public static void main(String[] args) {
        Tv tv1 = new Tv("티비1");
        Radio radio1 = new Radio("라디오1");
        RemoteController<Tv> tvRemoteController1 = new RemoteController<Tv>(tv1);
        RemoteController<Radio> radioRemoteController1 = new RemoteController<Radio>(radio1);

        Tv connectedTv = tvRemoteController1.getConnectedDevice();
        System.out.println(connectedTv.getTitle());

        Radio connectedRadio = radioRemoteController1.getConnectedDevice();
        System.out.println(connectedRadio.getName());
    }
}

package org.example.generic;

public class Main {
    public static void main(String[] args) {
        Tv tv1 = new Tv("티비1");
        Radio radio1 = new Radio("라디오1");
        RemoteController tvRemoteController1 = new RemoteController(tv1);
        RemoteController radioRemoteController1 = new RemoteController(radio1);

        Tv connectedTv = (Tv)tvRemoteController1.getConnectedDevice();
        System.out.println(connectedTv.getTitle());

        Radio connectedRadio = (Radio)radioRemoteController1.getConnectedDevice();
        System.out.println(connectedRadio.getName());
    }
}

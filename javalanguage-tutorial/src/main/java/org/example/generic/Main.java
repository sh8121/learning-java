package org.example.generic;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Tv tv = new Tv("티비");
        Radio radio = new Radio("라디오");
        TvRemoteController tvRemoteController = new TvRemoteController(tv);
        RadioRemoteController radioRemoteController = new RadioRemoteController(radio);

        ParameterizedType remoteControllerTvType = (ParameterizedType)tvRemoteController.getClass().getGenericSuperclass();
        System.out.println(remoteControllerTvType.getActualTypeArguments()[0]);

        ParameterizedType remoteControllerRadioType = (ParameterizedType)radioRemoteController.getClass()
                .getDeclaredField("remoteController").getGenericType();
        System.out.println(remoteControllerRadioType.getActualTypeArguments()[0]);
    }
}

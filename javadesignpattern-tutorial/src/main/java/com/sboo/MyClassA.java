package com.sboo;


public class MyClassA implements Observer {

    private boolean play;

    @Override
    public void update(boolean play) {
        this.play = play;
        myActControl();
    }

    public void myActControl() {
        if(play) {
            System.out.println("MyClassA: 동작을 시작합니다.");
        }
        else {
            System.out.println("MyClassA: 동작을 정지합니다.");
        }
    }
}

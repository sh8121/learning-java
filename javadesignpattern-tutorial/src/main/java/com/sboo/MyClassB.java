package com.sboo;

public class MyClassB implements Observer {
    private Publisher observable;
    private boolean play;

    public MyClassB(Publisher o) {
        this.observable = o;
        observable.addObserver(this);
    }

    @Override
    public void update(boolean play) {
        this.play = play;
        myActControl();
    }

    public void myActControl() {
        if(play) {
            System.out.println("MyClassB: 동작을 시작합니다.");
        }
        else {
            System.out.println("MyClassB: 동작을 정지합니다.");
            observable.deleteObserver(this);
        }
    }
}

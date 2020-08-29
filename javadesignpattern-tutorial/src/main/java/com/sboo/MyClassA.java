package com.sboo;


public class MyClassA implements Observer {
    private Publisher observable; //등록될 Observable
    private boolean play; //실행 여부

    //생성될 때 직접 자기 자신을 옵저버로 등록한다.
    public MyClassA(Publisher o) {
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
            System.out.println("MyClassA: 동작을 시작합니다.");
        }
        else {
            System.out.println("MyClassA: 동작을 정지합니다.");
        }
    }
}

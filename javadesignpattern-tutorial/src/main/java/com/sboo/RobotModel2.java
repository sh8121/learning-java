package com.sboo;

public class RobotModel2 implements IRobot {

    @Override
    public void powerOn() {
        System.out.println("type2 : power on");
    }

    @Override
    public void powerOff() {
        System.out.println("type2 : power off");
    }

    // 행동(요리) 추가
    public void doCook() {
        System.out.println("요리를 합니다.");
    }
}

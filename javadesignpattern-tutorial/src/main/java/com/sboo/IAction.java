package com.sboo;

// Interface를 추가하고 다중구현 하는 방식으로도 구현이 가능하지만
// RobotModel1, RobotModel2 에 변경이 가해진다.

// IRobot, RobotModel1, RobotModel2 의 변경 없이 기능을 추가하려고 한다.
public class IAction {
    private IRobot robot;

    public IAction(IRobot robot) {
        this.robot = robot;
    }

    // IRobot의 기능을 전부 똑같이 구현한다.
    void powerOn() {
        robot.powerOn();
    }

    void powerOff() {
        robot.powerOff();
    }
}

//public interface IWork {
//void doWork();
//}


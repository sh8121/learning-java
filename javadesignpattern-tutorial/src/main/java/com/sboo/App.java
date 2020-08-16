package com.sboo;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Date date = new Date();
        System.out.println(date);
    }

    public static void getDate(Date d) {
        Date date = d;
        System.out.println(date);
    }

    public static void memberUse1() {
        //강한 결합: 직접 생성
        Member m1 = new Member();
    }

    public static void memberUse2(Member m) {
        //약한 결합: 생성된 것을 주입 받음. - 의존 주입(Dependency Injection)
        Member m2 = m;
    }
}

//Member를 사용한다 --> Member의 기능에 의존한다.
class Member {
    String name;
    String nickname;

    public Member() {}
}

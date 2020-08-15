package com.sboo.di;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MemberTest {
    @Test
    public void getterSetter() {
        Member member = new Member();
        member.setName("Sang Hoon");
        member.setAge(32);

        assertEquals(member.getName(), "Sang Hoon");
        assertEquals(member.getAge(), 32);
    }
}
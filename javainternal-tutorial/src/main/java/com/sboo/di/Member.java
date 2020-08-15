package com.sboo.di;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode
public class Member {
    private String name;

    private int age;

    public boolean isSampleAge(Member member) {
        return this.age == member.age;
    }
}

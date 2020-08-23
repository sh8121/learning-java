package com.sboo;

import java.time.LocalDate;
import java.time.Month;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //다양한 생성자를 만들 필요성이 없어짐.
        Person p1 = Person.builder()
                .firstName("FirstName")
                .lastName("LastName")
                .addressOne("강동구 성내동")
                .addressTwo("AddressTwo")
                .birthDate(LocalDate.of(1988, Month.JANUARY, 21))
                .sex("Man")
                .driverLicense(true)
                .married(true)
                .build();

        Person p2 = Person.builder()
                .firstName("FirstName")
                .lastName("LastName")
                .build();

        System.out.println(p1.getAddressOne());
    }
}
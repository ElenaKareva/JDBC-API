package com.netology.jdbc_daolayer.person;

import lombok.Data;

@Data
public class Person {

    private Long id;
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    private String product_name;

}

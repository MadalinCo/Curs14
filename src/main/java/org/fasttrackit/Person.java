package org.fasttrackit;

import java.util.InvalidPropertiesFormatException;

public class Person {
    private final Integer id;
    private final String name;
    private final Integer age;

    public Integer getId() {
        return id;
    }

    public String getName() {
        if(name==null) {
            return "Please enter your name";
        }
        return name;
    }

    public Integer getAge() {

        return age;
    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

package com;

import com.tuonbondol.kotlin.MaxKt;
import com.tuonbondol.kotlin.Person;

public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello, Java");

        Person me = new Person("Dara", "Romdol");
        System.out.println("The new employee's name is " + me.getFirstName());

        me.setFirstName("Barry");

        System.out.println("My nickname is " + me.getFirstName());

        Integer maxInt = MaxKt.max(2001, 2010);
        System.out.println("The max value is " + maxInt);
    }
}

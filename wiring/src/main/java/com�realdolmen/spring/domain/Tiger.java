package com.realdolmen.spring.domain;

import com.realdolmen.spring.service.Food;

/**
 * Created by cda5732 on 25/03/2015.
 */
public class Tiger extends Animal {
    public Tiger(String s) {
        super(s);
    }

    @Override
    public void feed(Food f) {
        System.out.print("omnomnomnommiauw...");

    }

//    @Override
//    public String getName() {
//        return "Tiger" + getName();
//    }
}

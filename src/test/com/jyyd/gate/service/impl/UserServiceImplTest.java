package com.jyyd.gate.service.impl;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author:yangbiao
 * @Describe
 * @Create 2020-12-28
 */
class UserServiceImplTest {

    @Test
    void selectUser() {
        String test = "[1,2,3,4,5]";
        String substring = test.substring(1, test.length() - 1);
        String[] split = substring.split(",");
        ArrayList<Integer> integers = new ArrayList<>();
        for (String s : split){
            integers.add(Integer.valueOf(s));
            System.out.println(s);
        }
        System.out.println(integers);
    }
}
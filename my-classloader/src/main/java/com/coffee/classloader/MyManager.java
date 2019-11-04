package com.coffee.classloader;

import java.time.LocalTime;

/**
 * @author zhang.hp
 * @date 2019/11/4.
 */
public class MyManager implements BaseManager {

    @Override
    public void logic() {
        System.out.println(LocalTime.now() + ": Java类的热加载hhhhhh");
    }
}

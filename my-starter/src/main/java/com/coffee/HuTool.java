package com.coffee;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

/**
 * @author zhang.hp
 * @date 2019/10/30.
 */
public class HuTool {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Snowflake snowflake = IdUtil.getSnowflake(1, 1);
            long l = snowflake.nextId();
            System.out.println(l);
        }
    }
}

package com.coffee.cacheManager.ratelimiter;

import com.google.common.util.concurrent.RateLimiter;

/**
 * @author zhang.hp
 * @date 2019/11/4.
 */
public class RateLimiterStudy {
    public static void main(String[] args) {
        RateLimiter rateLimiter = RateLimiter.create(2);
        for (int i = 0; i < 10; i++) {
            rateLimiter.acquire();
            System.out.println(rateLimiter.getRate());
        }
    }
}

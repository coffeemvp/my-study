package com.coffee.cacheManager.service;

import com.coffee.cacheManager.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;


/**
 * @author zhang.hp
 * @date 2019/10/31.
 */
@Component
public class CacheService {

    @Cacheable("users")
    public User getByIsbn(int id) {
        simulateSlowService();
        return new User(id, "Some book " + id);
    }

    private void simulateSlowService() {
        try {
            long time = 5000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}

package com.coffee.cacheManager;

import com.coffee.cacheManager.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

/**
 * @author zhang.hp
 * @date 2019/10/31.
 */
@SpringBootApplication
@EnableCaching
public class CacheApplication {
    @Autowired
    private CacheService cacheService;

    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class);
    }

    @Bean
    @Order(2)
    public CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println(cacheService.getByIsbn(1).toString());
            System.out.println(cacheService.getByIsbn(2).toString());
            System.out.println("=========get cache ========");
            System.out.println(cacheService.getByIsbn(1).toString());
            System.out.println(cacheService.getByIsbn(2).toString());
        };
    }
    @Bean
    @Order(1)
    public ApplicationRunner applicationRunner(){
        return args -> {
            System.out.println(111111111);
        };
    }
}

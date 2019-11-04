package com.coffee.mystarter;

import com.coffee.mystarter.service.HelloService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhang.hp
 * @date 2019/9/29.
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnClass(HelloService.class)
@ConditionalOnBean
public class HelloServiceAutoConfiguration {

    @Autowired
    HelloProperties helloProperties;

    @Bean
    HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setName(helloProperties.getName());
        helloService.setMsg(helloProperties.getMsg());
        return helloService;
    }

    public static void main(String[] args) {

    }
    class MyBeanPostProcessor implements BeanPostProcessor {

        public  Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
            System.out.println(beanName + "1111");
            return bean;
        }

        public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
            System.out.println(beanName + "2222");
            return bean;
        }
    }

    class MyInitMethod implements InitializingBean {

        public void afterPropertiesSet() throws Exception {
            System.out.println("333333");
        }
    }

    class MyDestory implements DisposableBean {
        public void destroy() throws Exception {
            System.out.println("4444444");
        }
    }
}

package top.serug.dubbobootconsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Author: serug
 * @Date: 2020/5/15  08:48
 */
@SpringBootApplication
@EnableDubbo
public class DubboBootConsumerApplication8202 {
    public static void main(String[] args) {
        SpringApplication.run(DubboBootConsumerApplication8202.class, args);
    }
}

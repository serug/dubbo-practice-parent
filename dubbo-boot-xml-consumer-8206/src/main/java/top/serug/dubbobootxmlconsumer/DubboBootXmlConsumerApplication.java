package top.serug.dubbobootxmlconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description:
 * @Author: serug
 * @Date: 2020/5/15  17:46
 */
@SpringBootApplication
@ImportResource(locations = "classpath:consumer.xml")
public class DubboBootXmlConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboBootXmlConsumerApplication.class, args);
    }
}

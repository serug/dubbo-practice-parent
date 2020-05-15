package top.serug.dubbobootxmlprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description:
 * @Author: serug
 * @Date: 2020/5/15  17:29
 */
@SpringBootApplication
@ImportResource(locations = "classpath:provider.xml")
public class DubboBootXmlProviderApplication8205 {

    public static void main(String[] args) {
        SpringApplication.run(DubboBootXmlProviderApplication8205.class, args);
    }
}

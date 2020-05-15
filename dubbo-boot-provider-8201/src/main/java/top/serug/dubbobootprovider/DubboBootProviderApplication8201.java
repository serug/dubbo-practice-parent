package top.serug.dubbobootprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Author: serug
 * @Date: 2020/5/14  19:58
 */
@SpringBootApplication
//开启Dubbo的包扫描，也可以通过在配置文件中配置dubbo.scan.base-packages=top.serug.dubbobootprovider
@EnableDubbo
public class DubboBootProviderApplication8201 {

    public static void main(String[] args) {
        SpringApplication.run(DubboBootProviderApplication8201.class, args);
    }
}

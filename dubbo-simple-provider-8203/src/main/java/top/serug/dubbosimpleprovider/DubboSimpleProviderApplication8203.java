package top.serug.dubbosimpleprovider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: serug
 * @Date: 2020/5/15  15:21
 */

public class DubboSimpleProviderApplication8203 {

    public static void main(String[] args) throws InterruptedException {

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();

        Thread.sleep(Long.MAX_VALUE);

    }
}

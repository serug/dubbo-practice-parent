package top.serug.dubbosimpleconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.serug.dubbopractice.entity.DemoEntity;
import top.serug.dubbopractice.service.DemoConsumerService;
import top.serug.dubbopractice.service.DemoProviderService;

import javax.sound.midi.Soundbank;
import java.util.List;

/**
 * @Description:
 * @Author: serug
 * @Date: 2020/5/15  15:42
 */
public class DubboSimpleConsumerApplication8204 {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        DemoConsumerService demoConsumerService = context.getBean(DemoConsumerService.class);
        demoConsumerService.invokeProviderService();

    }
}

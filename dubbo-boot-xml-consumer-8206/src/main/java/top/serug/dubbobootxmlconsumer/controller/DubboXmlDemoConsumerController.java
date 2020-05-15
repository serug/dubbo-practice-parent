package top.serug.dubbobootxmlconsumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.serug.dubbopractice.entity.DemoEntity;
import top.serug.dubbopractice.service.DemoProviderService;

import java.util.List;

/**
 * @Description:
 * @Author: serug
 * @Date: 2020/5/15  08:42
 */
@RestController
@RequestMapping("/consumer/xml")
public class DubboXmlDemoConsumerController {

    @Reference
    private DemoProviderService demoProviderService;

    @RequestMapping("/getList")
    public Object getList() throws InterruptedException {
        List<DemoEntity> list =demoProviderService.getDemoEntityList();
        //Thread.sleep(10000);
        return list;
    }

}

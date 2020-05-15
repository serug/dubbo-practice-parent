package top.serug.dubbosimpleconsumer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import top.serug.dubbopractice.entity.DemoEntity;
import top.serug.dubbopractice.service.DemoConsumerService;
import top.serug.dubbopractice.service.DemoProviderService;

import java.util.List;

/**
 * @Description:
 * @Author: serug
 * @Date: 2020/5/15  15:48
 */
public class DemoConsumerServiceImpl implements DemoConsumerService {

    @Autowired
    private DemoProviderService demoProviderService;

    public void invokeProviderService() {

        List<DemoEntity> list = demoProviderService.getDemoEntityList();
        for (DemoEntity demoEntity : list) {
            System.out.println(demoEntity.getDemoName());
        }
    }
}

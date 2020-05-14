package top.serug.dubbobootprovider.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import top.serug.dubbopractice.entity.DemoEntity;
import top.serug.dubbopractice.service.DemoProviderService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: serug
 * @Date: 2020/5/14  19:59
 */
@Component
@Service
public class BootDemoProviderServiceImpl implements DemoProviderService {

    public List<DemoEntity> getDemoEntityList() {
        List<DemoEntity> list = new ArrayList<DemoEntity>();
        list.add(new DemoEntity(1,"张三"));
        list.add(new DemoEntity(2,"李四"));
        return list;
    }

    public DemoEntity getDemoEntityByInfo(Integer demoId, String demoName) {
        return new DemoEntity(demoId,demoName);
    }
}

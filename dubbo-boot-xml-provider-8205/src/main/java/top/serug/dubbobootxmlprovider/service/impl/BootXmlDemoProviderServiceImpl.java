package top.serug.dubbobootxmlprovider.service.impl;

import top.serug.dubbopractice.entity.DemoEntity;
import top.serug.dubbopractice.service.DemoProviderService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: serug
 * @Date: 2020/5/15  17:32
 */
public class BootXmlDemoProviderServiceImpl implements DemoProviderService {
    public List<DemoEntity> getDemoEntityList() {
        List<DemoEntity> list = new ArrayList<DemoEntity>();
        list.add(new DemoEntity(3,"BootXmlDemoProviderServiceImpl 8205"));
        list.add(new DemoEntity(4,"BootXmlDemoProviderServiceImpl 8205"));
        return list;
    }

    public DemoEntity getDemoEntityByInfo(Integer demoId, String demoName) {
        return new DemoEntity(demoId,demoName);
    }
}

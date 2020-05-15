package top.serug.dubbosimpleprovider.service.impl;

import org.springframework.stereotype.Service;
import top.serug.dubbopractice.entity.DemoEntity;
import top.serug.dubbopractice.service.DemoProviderService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: serug
 * @Date: 2020/5/15  15:23
 */
@Service
public class SimpleDemoProviderServiceImpl implements DemoProviderService {

    public List<DemoEntity> getDemoEntityList() {
        List<DemoEntity> list = new ArrayList<DemoEntity>();
        list.add(new DemoEntity(3,"SimpleDemoProviderServiceImpl 8203"));
        list.add(new DemoEntity(4,"SimpleDemoProviderServiceImpl 8203"));
        return list;
    }

    public DemoEntity getDemoEntityByInfo(Integer demoId, String demoName) {
        return new DemoEntity(demoId,demoName);
    }
}

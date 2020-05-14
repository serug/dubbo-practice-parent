package top.serug.dubbopractice.service;

import top.serug.dubbopractice.entity.DemoEntity;

import java.util.List;

/**
 * @Description:
 * @Author: serug
 * @Date: 2020/5/14  17:34
 */
public interface DemoProviderService {

    public List<DemoEntity> getDemoEntityList();

    public DemoEntity getDemoEntityByInfo(Integer demoId, String demoName);
}

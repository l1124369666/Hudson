package hudson.service.impl;

import hudson.dao.TestDao;
import hudson.entity.TestEntity;
import hudson.service.TestService;
import hudson.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gengyu
 * @Date 2020/10/10
 */
@Service
public class TestImpl implements TestService {
    @Autowired
    private TestDao testDao;

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public List<TestEntity> getTest() {
        List<TestEntity> list = testDao.getTest();
        redisUtils.lSet("woCao",list);
        return list;
    }
}

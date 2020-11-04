package hudson.service;

import hudson.entity.TestEntity;

import java.util.List;

/**
 * @author Gengyu
 * @Date 2020/10/10
 */
public interface TestService {
    List<TestEntity> getTest();
}

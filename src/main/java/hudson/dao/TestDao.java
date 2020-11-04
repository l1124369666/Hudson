package hudson.dao;

import hudson.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Gengyu
 * @Date 2020/10/12
 */
@Mapper
public interface TestDao {
    /**
     * 获取
     * @return
     */
    List<TestEntity> getTest();
}

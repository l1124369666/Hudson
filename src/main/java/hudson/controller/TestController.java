package hudson.controller;

import hudson.entity.TestEntity;
import hudson.service.TestService;
import hudson.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Gengyu
 * @Date 2020/10/12
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private TestService testService;

    @Autowired
    private RedisUtils redisUtils;

    @GetMapping(value = "/getTest")
    public List<TestEntity> getTest(){
        redisUtils.lGet("woCao",0,-1);
        List list = testService.getTest();
        return list;
    }
}

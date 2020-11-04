package hudson.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by boot on 2020/6/16.
 * @author Gengyu
 */
@Configuration
@MapperScan(basePackages = "hudson.dao")
public class MybatisConfig {
}

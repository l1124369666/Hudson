package hudson.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Gengyu
 * @Date 2020/10/12
 */
@Data
public class TestEntity {
    private Integer id;
    private String name;
    private String sex;
    private LocalDateTime birthday;
}

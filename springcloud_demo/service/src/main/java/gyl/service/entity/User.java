package gyl.service.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @program: spring_cloud_demo
 * @description: 用户类
 * @author: gyl
 * @create: 2020-04-12 20:11
 **/
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {
    private int id;
    private String name;
    private String password;
}

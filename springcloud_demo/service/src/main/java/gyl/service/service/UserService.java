package gyl.service.service;

import gyl.service.entity.User;

import java.util.List;

/**
 * @program: spring_cloud_demo
 * @description: UserService接口
 * @author: gyl
 * @create: 2020-04-12 20:20
 **/
public interface UserService {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAllUser();
}

package gyl.service.dao;

import gyl.service.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: spring——cloud_demo
 * @description: UserDao接口
 * @author: gyl
 * @create: 2020-04-12 20:24
 **/
@Repository
public interface UserDao {
    /**
     * 查询所有用户
     * @return
     */
    List<User> findAllUser();
}

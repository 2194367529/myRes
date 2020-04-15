package gyl.service.service.impl;

import gyl.service.dao.UserDao;
import gyl.service.entity.User;
import gyl.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springcloud_demo
 * @description: UserService实现类
 * @author: gyl
 * @create: 2020-04-12 20:27
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    RedisTemplate<Object,Object> myRedisTemplate;
    /**
     * 查询所有用户
     *
     * @return
     */
    @Override
    public List<User> findAllUser() {
        List<User> users=userDao.findAllUser();
        System.out.println("test:"+myRedisTemplate.opsForValue().get("test"));
        return users;
    }
}

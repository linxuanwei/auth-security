package org.seven.service;

import org.seven.domain.User;
import org.seven.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Seven.Lin
 * @date 2020/1/6 16:24
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User getOne(Long uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    public User getOneByPhone(String phone) {
        return userMapper.selectByPhone(phone);
    }

    public User getOneByNick(String nick) {
        return userMapper.selectByNick(nick);
    }

    public List<User> findAll() {
        return userMapper.selectAll();
    }

    public Integer create(User user) {
        return userMapper.insert(user);
    }
}
